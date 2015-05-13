/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AudioControle;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Irlei
 */
 public class PlayWave extends Thread {
    private InputStream filenameInputStream;
    private Position curPosition;
    private File som;
    private final int EXTERNAL_BUFFER_SIZE = 524288; // 128Kb
    enum Position {
        LEFT, RIGHT, NORMAL
    };

    public PlayWave() {
        this.curPosition = Position.NORMAL;
    }

    public PlayWave(InputStream wavfile) {
        filenameInputStream = wavfile;
        curPosition = Position.NORMAL;
    }

    public PlayWave(InputStream wavfile, Position p) {
        filenameInputStream = wavfile;
        curPosition = p;
    }

    public Position getCurPosition() {
        return curPosition;
    }

    public void setCurPosition(Position curPosition) {
        this.curPosition = curPosition;
    }

    public InputStream getFilename() {
        return filenameInputStream;
    }

    public void setFilename(InputStream filename) {
        this.filenameInputStream = filename;
    }



    public void run() {


        if (filenameInputStream==null) {

            return;
        }
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(filenameInputStream);
        } catch (UnsupportedAudioFileException e1) {
            e1.printStackTrace();
            return;
        } catch (IOException e1) {
            e1.printStackTrace();
            return;
        }

        AudioFormat format = audioInputStream.getFormat();
        SourceDataLine auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

        try {
            auline = (SourceDataLine) AudioSystem.getLine(info);
            auline.open(format);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        if (auline.isControlSupported(FloatControl.Type.PAN)) {
            FloatControl pan = (FloatControl) auline
                    .getControl(FloatControl.Type.PAN);
            if (curPosition == Position.RIGHT)
                pan.setValue(1.0f);
            else if (curPosition == Position.LEFT)
                pan.setValue(-1.0f);
        }

        auline.start();
        int nBytesRead = 0;
        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];

        try {
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead >= 0)
                    auline.write(abData, 0, nBytesRead);
            }
             filenameInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {

            auline.drain();
            auline.close();
        }

    }
}
