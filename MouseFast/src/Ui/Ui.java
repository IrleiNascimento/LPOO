
package Ui;

import AudioControle.PlayWave;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

/**
 *
 * @author Irlei
 */
public class Ui extends javax.swing.JFrame {

    private final static long PAUSE = 1000;
    private final static int B_AZUL = 1;
    private final static int B_VERMELHO = 0;
    private List<JButton> botoes;
    private Thread iniciarJogo;
    private boolean iniciado = false;
    private final ImageIcon balaoVermelho = new ImageIcon(getClass().getResource("/Imagens/balao_vermelho.png"));
    private final ImageIcon balaoAzul = new ImageIcon(getClass().getResource("/Imagens/balao_azul.png"));
    private final ImageIcon mouse = new ImageIcon(getClass().getResource("/Imagens/mouse.png"));
    private final ImageIcon mouseE = new ImageIcon(getClass().getResource("/Imagens/mouse_b_esquerdo.png"));
    private final ImageIcon mouseD = new ImageIcon(getClass().getResource("/Imagens/mouse_b_direito.png"));
    private final ImageIcon balaoAzul_estouro = new ImageIcon(getClass().getResource("/Imagens/balao_azul_estourado.png"));
    private final ImageIcon balaoVermelho_estouro = new ImageIcon(getClass().getResource("/Imagens/balao_vermelho_estourado.png"));
    private Random randon = new Random();
    private ImageIcon[] imagens = new ImageIcon[]{balaoVermelho, balaoAzul};
    private int bselect = -1;
    private int erros = 0;
    private static int VELOCIDADE = 2000;
    private Resultado resultado;
    private Resultado resultado2;
    private Thread threadRelogio;
    private int nivel = 1;
    private PlayWave som;
    final InputStream  fileSom =  getClass().getClassLoader().getResourceAsStream("som/estouro.wav");
    public Ui() {
        initComponents();
        delay();
        setIconImage(new ImageIcon(getClass().getResource("/Imagens/splash.png")).getImage());
        setTitle("Mouse Fast");
        baloes(this.jPanel_grade_botoes);
        this.jButton_parar.setEnabled(isIniciado());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_mouse = new javax.swing.JLabel();
        jPanel_grade_botoes = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton_iniciar = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jLabel_nome_jogador = new javax.swing.JLabel();
        jLabel_pontos_b_esquerdo = new javax.swing.JLabel();
        jLabel_pontos_b_direito = new javax.swing.JLabel();
        jButton_parar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel_relogio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_nivel = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_mouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mouse.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel_mouse)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_mouse)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel_grade_botoes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));

        jButton1.setBackground(new Color(0,0,0,0));
        jButton1.setEnabled(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setBackground(new Color(0,0,0,0));
        jButton2.setEnabled(false);

        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setEnabled(false);

        jButton4.setBackground(new Color(0,0,0,0));
        jButton4.setEnabled(false);

        jButton5.setBackground(new Color(0,0,0,0));

        jButton6.setBackground(new Color(0,0,0,0));

        jButton7.setBackground(new Color(0,0,0,0));
        jButton7.setEnabled(false);

        jButton9.setBackground(new Color(0,0,0,0));

        jButton10.setBackground(new Color(0,0,0,0));

        jButton11.setBackground(new Color(0,0,0,0));

        jButton12.setBackground(new Color(0,0,0,0));
        jButton12.setEnabled(false);

        jButton13.setBackground(new Color(0,0,0,0));

        jButton14.setBackground(new Color(0,0,0,0));

        jButton15.setBackground(new Color(0,0,0,0));

        jButton16.setBackground(new Color(0,0,0,0));

        jButton17.setBackground(new Color(0,0,0,0));

        jButton18.setBackground(new Color(0,0,0,0));

        jButton19.setBackground(new Color(0,0,0,0));

        jButton20.setBackground(new Color(0,0,0,0));

        jButton21.setBackground(new Color(0,0,0,0));

        jButton22.setBackground(new Color(0,0,0,0));

        jButton23.setBackground(new Color(0,0,0,0));

        jButton24.setBackground(new Color(0,0,0,0));

        jButton25.setBackground(new Color(0,0,0,0));

        jButton26.setBackground(new Color(0,0,0,0));

        jButton27.setBackground(new Color(0,0,0,0));

        jButton28.setBackground(new Color(0,0,0,0));

        jButton29.setBackground(new Color(0,0,0,0));

        jButton30.setBackground(new Color(0,0,0,0));

        jButton31.setBackground(new Color(0,0,0,0));

        jButton32.setBackground(new Color(0,0,0,0));

        jButton33.setBackground(new Color(0,0,0,0));

        jButton34.setBackground(new Color(0,0,0,0));

        jButton35.setBackground(new Color(0,0,0,0));

        jButton36.setBackground(new Color(0,0,0,0));

        jButton37.setBackground(new Color(0,0,0,0));

        jButton38.setBackground(new Color(0,0,0,0));

        jButton39.setBackground(new Color(0,0,0,0));

        jButton40.setBackground(new Color(0,0,0,0));

        jButton59.setBackground(new Color(0,0,0,0));

        javax.swing.GroupLayout jPanel_grade_botoesLayout = new javax.swing.GroupLayout(jPanel_grade_botoes);
        jPanel_grade_botoes.setLayout(jPanel_grade_botoesLayout);
        jPanel_grade_botoesLayout.setHorizontalGroup(
            jPanel_grade_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_grade_botoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_grade_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_grade_botoesLayout.createSequentialGroup()
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_grade_botoesLayout.createSequentialGroup()
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_grade_botoesLayout.createSequentialGroup()
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_grade_botoesLayout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_grade_botoesLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_grade_botoesLayout.setVerticalGroup(
            jPanel_grade_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_grade_botoesLayout.createSequentialGroup()
                .addGroup(jPanel_grade_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_grade_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_grade_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_grade_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_grade_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_iniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_iniciar.setText("Iniciar");
        jButton_iniciar.setToolTipText("Iniciar o jogo");
        jButton_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_iniciarActionPerformed(evt);
            }
        });

        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuario_32x32.png"))); // NOI18N
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jLabel_nome_jogador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel_pontos_b_esquerdo.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel_pontos_b_esquerdo.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_pontos_b_esquerdo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_pontos_b_esquerdo.setText("0");

        jLabel_pontos_b_direito.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel_pontos_b_direito.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_pontos_b_direito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_pontos_b_direito.setText("0");

        jButton_parar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_parar.setText("parar");
        jButton_parar.setToolTipText("parar o jogo");
        jButton_parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pararActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 minuto", "2 minutos", "3 minutos", "4 minutos", "5 minutos" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel_relogio.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_relogio.setText("00:00");

        jLabel1.setText("Tempo do jogo:");

        jComboBox_nivel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jComboBox_nivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nível 1", "nível 2", "nível 3" }));
        jComboBox_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_nivelActionPerformed(evt);
            }
        });

        jMenu1.setText("Exibir");

        jMenuItem3.setText("Exibir melhor resultado");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Ajuda");
        jMenu4.setMargin(new java.awt.Insets(2, 25, 2, 2));
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Ajuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);
        jMenu4.add(jSeparator1);

        jMenuItem2.setText("sobre");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jComboBox_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton_iniciar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_parar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton58)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel_nome_jogador, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1))
                            .addGap(13, 13, 13)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_relogio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_pontos_b_esquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_pontos_b_direito, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel_grade_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton58)
                            .addComponent(jLabel_nome_jogador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_iniciar)
                            .addComponent(jButton_parar))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_relogio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_pontos_b_esquerdo)
                            .addComponent(jLabel_pontos_b_direito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_grade_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1008, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON3) {
            //pause();
        }
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_iniciarActionPerformed
        // TODO add your handling code here:
        iniciado = true;
        if (!(this.jLabel_nome_jogador.getText().length() <= 0)) {
            start();
        } else {
            jButton58ActionPerformed(evt);
        }

    }//GEN-LAST:event_jButton_iniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, new Info(), "Sobre", 1);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, new Ajuda(), "Ajuda", 1);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton_pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pararActionPerformed
        // TODO add your handling code here:
        parar();
        threadRelogio.interrupt();

    }//GEN-LAST:event_jButton_pararActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, new Jogador(this.jLabel_nome_jogador), "Jogador", 3);

    }//GEN-LAST:event_jButton58ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if (this.resultado2 != null) {
            JOptionPane.showMessageDialog(null, new PainelResultado(this.resultado2), "Jogo encerrado", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Não existe resultado anterior\nSEJA O PRIMEIRO!!!");

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_nivelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Ui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_iniciar;
    private javax.swing.JButton jButton_parar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox_nivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_mouse;
    private javax.swing.JLabel jLabel_nome_jogador;
    private javax.swing.JLabel jLabel_pontos_b_direito;
    private javax.swing.JLabel jLabel_pontos_b_esquerdo;
    private javax.swing.JLabel jLabel_relogio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_grade_botoes;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void carregarBaloes(JComponent panel) {
        if (this.botoes == null) {
            this.botoes = new ArrayList<>();
        }
        for (int i = 0; i < panel.getComponentCount(); i++) {
            this.botoes.add((JButton) panel.getComponent(i));
            this.botoes.get(i).addMouseListener(new java.awt.event.MouseAdapter() {

                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    mudarImagem(evt);
                }
            });
            this.botoes.get(i).setBackground(new Color(0,0,0,0));
            this.botoes.get(i).setEnabled(isIniciado());
            this.botoes.get(i).setIcon(null);
            this.botoes.get(i).setPressedIcon(null);

        }
    }

    private void pause() {
        try {
            Thread.sleep(PAUSE);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void execultarSom(){

if(this.som ==null){
     this.som=new PlayWave(fileSom);
     this.som.start();

}else{
    this.som.stop();

}


}
    private void mudarImagem(MouseEvent evt) {
        //((JButton) evt.getComponent()).setEnabled(false);
        JButton b = (JButton) evt.getComponent();
        if (b != null && b.getIcon() != null) {
            if (b.getIcon().equals(imagens[B_AZUL]) && evt.getButton() == MouseEvent.BUTTON1) {
                this.jLabel_mouse.setIcon(mouseE);
                this.resultado.pontos_e++;
                this.jLabel_pontos_b_esquerdo.setText(String.valueOf(this.resultado.pontos_e));
               // execultarSom();
                b.setIcon(null);
            } else if (b.getIcon().equals(imagens[B_VERMELHO]) && evt.getButton() == MouseEvent.BUTTON1) {
                this.resultado.pontos_d--;
                this.resultado.erros_d++;
                erros++;
                this.jLabel_pontos_b_direito.setText(String.valueOf(this.resultado.pontos_d));
                b.setIcon(balaoVermelho_estouro);
            } else if (b.getIcon().equals(imagens[B_VERMELHO]) && evt.getButton() == MouseEvent.BUTTON3) {
                this.resultado.pontos_d++;
                this.jLabel_mouse.setIcon(mouseD);
                this.jLabel_pontos_b_direito.setText(String.valueOf(this.resultado.pontos_d));
                //execultarSom();
                b.setIcon(null);
            } else if (b.getIcon().equals(imagens[B_AZUL]) && evt.getButton() == MouseEvent.BUTTON3) {
                this.resultado.pontos_e--;
                this.resultado.erros_e++;
                erros++;
                this.jLabel_pontos_b_esquerdo.setText(String.valueOf(this.resultado.pontos_e));
                b.setIcon(balaoAzul_estouro);

            }

            b.setPressedIcon(null);
        }
    }
    int count = 0;

    private void mostraBalao() {
        JButton btemp = null;
        int size = botoes.size();
        if (size > 0) {

            if (isIniciado() && this.bselect >= 0) {
                btemp = botoes.get(bselect);
            }
            Random num = new Random();
            int bs = num.nextInt(size);
            if (btemp != null && botoes.get(bs).equals(btemp)) {
                mostraBalao();
            } else {
                switch (this.nivel) {

                    case 1:
                        if (botoes.get(bs).getIcon() != null) {
                            int perc = (size * 60) / 100;

                            if (erros >= perc || this.count >= perc) {
                                VELOCIDADE = 900;

                            } else if (erros >= (size * 40) / 100 || this.count >= (size * 40) / 100) {
                                VELOCIDADE = 1500;
                            }
                            if (erros >= (size * 80) / 100 || this.count >= (size * 80) / 100) {
                                VELOCIDADE = 1000;
                            }
                            if (erros >= (size * 90) / 100 || this.count >= (size * 90) / 100) {
                                VELOCIDADE = 800;
                            }
                        }
                        break;
                    case 2:
                        if (botoes.get(bs).getIcon() != null) {
                            int perc = (size * 60) / 100;

                            if (erros >= perc || this.count >= perc) {
                                VELOCIDADE = 900;

                            } else if (erros >= (size * 40) / 100 || this.count >= (size * 40) / 100) {
                                VELOCIDADE = 1000;
                            }
                            if (erros >= (size * 80) / 100 || this.count >= (size * 80) / 100) {
                                VELOCIDADE = 900;
                            }
                            if (erros >= (size * 90) / 100 || this.count >= (size * 90) / 100) {
                                VELOCIDADE = 600;
                            }
                        }

                        break;
                    case 3:
                        if (botoes.get(bs).getIcon() != null) {
                            int perc = (size * 60) / 100;

                            if (erros >= perc || this.count >= perc) {
                                VELOCIDADE = 600;

                            } else if (erros >= (size * 40) / 100 || this.count >= (size * 40) / 100) {
                                VELOCIDADE = 800;
                            }
                            if (erros >= (size * 80) / 100 || this.count >= (size * 80) / 100) {
                                VELOCIDADE = 500;
                            }
                            if (erros >= (size * 90) / 100 || this.count >= (size * 90) / 100) {
                                VELOCIDADE = 200;
                            }
                        }
                        break;
                }
                this.bselect = bs;

                if (botoes.get(bselect).getIcon() == null) {
                    ImageIcon balao = getImageIcon();
                    if (botoes.get(bselect).getPressedIcon() != null) {
                        botoes.get(bselect).setPressedIcon(null);
                    }
                    if (balao.equals(imagens[0])) {
                        botoes.get(bselect).setPressedIcon(balaoVermelho_estouro);
                    } else {
                        botoes.get(bselect).setPressedIcon(balaoAzul_estouro);
                    }
                    botoes.get(bselect).setIcon(balao);

                    if (!validar()) {
                        this.resultado.setJogador(this.jLabel_nome_jogador.getText());
                        JOptionPane.showMessageDialog(null, new PainelResultado(this.resultado), "Jogo encerrado", 1);
                        iniciado = false;
                        baloes(jPanel_grade_botoes);
                        setResultado2(this.resultado);
                        this.jButton_parar.setEnabled(false);
                        this.jButton_iniciar.setEnabled(true);
                        this.jLabel_pontos_b_direito.setText("0");
                        this.jLabel_pontos_b_esquerdo.setText("0");
                        iniciarJogo.interrupt();
                    }

                }
            }
        }
    }

    private ImageIcon getImageIcon() {
        int r = randon.nextInt(imagens.length);
        return imagens[r];


    }

    private void start() {
        carregarBaloes(this.jPanel_grade_botoes);
        this.jLabel_relogio.setText(pad(getTempo()) + ":00");
        this.jLabel_pontos_b_direito.setText("0");
        this.jLabel_pontos_b_esquerdo.setText("0");
        this.resultado = new Resultado();
        this.jButton_iniciar.setEnabled(false);
        this.jButton_parar.setEnabled(isIniciado());
        erros = 0;
        this.nivel=getNivel();
        //System.out.println(getNivel());
        this.iniciarJogo = new Thread() {

            @Override
            public void run() {
                while (iniciado) {
                    mostraBalao();
                    try {
                        iniciarJogo.sleep(VELOCIDADE);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        };
        iniciarJogo.start();

        threadRelogio = new Thread() {
            @Override
            public void run() {
                cronometro();
            }
        };
        threadRelogio.start();
    }

    private void baloes(JPanel jp) {
        jp.setEnabled(isIniciado());
        for (int i = 0; i < jp.getComponentCount(); i++) {
            JButton b = (JButton) jp.getComponent(i);
            b.setIcon(null);
            b.setEnabled(isIniciado());
        }
    }

    public boolean isIniciado() {
        return iniciado;
    }

    private boolean validar() {
        boolean result = false;
        for (JButton b : botoes) {
            if (b.getIcon() == null) {
                return true;
            }
            this.count++;
        }
        return result;
    }

    private Ui.Resultado getJogador() {
        if (this.resultado == null) {
            this.resultado = new Ui.Resultado();
        }

        return this.resultado;
    }

    private int getTempo() {
        switch (this.jComboBox1.getSelectedIndex()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 1;
        }
    }

    private int getNivel() {
        switch (this.jComboBox_nivel.getSelectedIndex()) {
            case 0:
                VELOCIDADE = 2000;
                return 1;
            case 1:
                VELOCIDADE = 1500;

                return 2;
            case 2:
                VELOCIDADE = 1000;
                return 3;
            default:
                return 1;
        }
    }

    private void parar() {
        if (isIniciado()) {
            iniciado = false;
            this.jButton_iniciar.setEnabled(true);
            this.getJogador().setJogador(this.jLabel_nome_jogador.getText());
            iniciarJogo.interrupt();
            JOptionPane.showMessageDialog(null, new PainelResultado(this.resultado),
                    "Jogo encerrado", 1);
            setResultado2(this.resultado);
            baloes(this.jPanel_grade_botoes);
            this.jButton_parar.setEnabled(false);
            VELOCIDADE = 1500;
        }
    }

    class Resultado {

        public String jogador;
        public int pontos_d = 0;
        public int erros_e = 0;
        public int erros_d = 0;
        public int pontos_e = 0;
        public int minuto = 0;
        public int segundo = 0;

        public double getMedia() {
            return (pontos_d + pontos_e) / 2;
        }

        public int getErros_d() {
            return erros_d;
        }

        public void setErros_d(int erros_d) {
            this.erros_d = erros_d;
        }

        public int getErros_e() {
            return erros_e;
        }

        public void setErros_e(int erros_e) {
            this.erros_e = erros_e;
        }

        public String getJogador() {
            return jogador;
        }

        public void setJogador(String jogador) {
            this.jogador = jogador;
        }

        public int getMinuto() {
            return minuto;
        }

        public void setMinuto(int minuto) {
            this.minuto = minuto;
        }

        public int getPontos_d() {
            return pontos_d;
        }

        public void setPontos_d(int pontos_d) {
            this.pontos_d = pontos_d;
        }

        public int getPontos_e() {
            return pontos_e;
        }

        public void setPontos_e(int pontos_e) {
            this.pontos_e = pontos_e;
        }

        public int getSegundo() {
            return segundo;
        }

        @Override
        protected Resultado clone() throws CloneNotSupportedException {
            super.clone();
            Resultado result = new Resultado();
            result.erros_d = this.erros_d;
            result.erros_e = this.erros_e;
            result.jogador = this.jogador;
            result.minuto = this.minuto;
            result.pontos_d = this.pontos_d;
            result.pontos_e = this.pontos_e;
            result.segundo = this.segundo;
            return result;
        }

        public void setSegundo(int segundo) {
            this.segundo = segundo;
        }
    }

    public void setResultado2(Resultado r) {
        if (this.resultado2 == null) {
            try {
                this.resultado2 = this.resultado.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (this.resultado.getMedia() > this.resultado2.getMedia()) {
            try {
                this.resultado2 = this.resultado.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void cronometro() {
        int minuto = getTempo();
        this.jLabel_relogio.setText(pad(minuto) + ":00");
        int segundo = 60;
        minuto--;
        while (isIniciado()) {

            if (this.jLabel_relogio.getText().equals("00:00")) {
                this.jLabel_relogio.setText(pad(minuto) + ":" + pad(segundo));
                parar();
                threadRelogio.interrupt();
            }

            try {
                Thread.sleep(1000);
                if (segundo == 0) {
                    minuto--;
                    segundo = 59;
                } else {
                    segundo--;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.jLabel_relogio.setText(pad(minuto) + ":" + pad(segundo));


        }
    }

    public static String pad(int num) {
        if (num < 10) {
            return "0" + num;
        }
        return String.valueOf(num);
    }

    private void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}