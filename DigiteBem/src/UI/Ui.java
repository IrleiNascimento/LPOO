/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Dao.Aluno;
import Dao.Palavra;
import Dao.Sessao;
import controle.ControlArquivo;
import controle.PlayWave;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author Irlei
 */
public class Ui extends javax.swing.JFrame {

    /**
     * Creates new form Ui
     */
    public final static String PATH = "digitando_bem";
    public final static String EXT = ".dig";
    private List<Palavra> array_palavras;
    private Aluno jogador_sessao;
    public String texto_amostra;
    public String texto_digitado;
    private Thread threadRelogio;
    private int pontos = 0;
    private int erro = 0;
    private int erro_parcial = 0;
    private int acerto = 0;
    private boolean iniciado = false;
    private int tempo = 5;
    private File file = new File(PATH + EXT);
    private PlayWave som;
    private PlayWave somfixo;
    final File  fileSom =  new File(getClass().getResource("/som/letra.WAV").getFile());


    public Ui() {
        initComponents();
        delay();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/splash.png")).getImage());
        setTitle("Digitando Bem");
        carregarDados();
        iniciar();
        componentEnable(jPanel_digitacao, false);
        restart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_digitacao = new javax.swing.JPanel();
        jLabel_texto_amostra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_mostra_letra_maiuscula = new javax.swing.JLabel();
        jLabel_mostra_letra_minuscula = new javax.swing.JLabel();
        digitacao_textfield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel_comemoracao = new javax.swing.JPanel();
        jLabel_gif_enter = new javax.swing.JLabel();
        jLabel_nome_do_aluno = new javax.swing.JLabel();
        jLabel_relogio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_pontos = new javax.swing.JLabel();
        jButton_iniciar = new javax.swing.JButton();
        jButton_jogador = new javax.swing.JButton();
        jLabel_nome_jogador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Digitando Bem");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel_texto_amostra.setFont(new java.awt.Font("SansSerif", 1, 64)); // NOI18N
        jLabel_texto_amostra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_texto_amostra.setText("Texto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Digite a palavra .");

        jLabel_mostra_letra_maiuscula.setFont(new java.awt.Font("SansSerif", 1, 60)); // NOI18N
        jLabel_mostra_letra_maiuscula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_mostra_letra_maiuscula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 204), 1, true));

        jLabel_mostra_letra_minuscula.setFont(new java.awt.Font("SansSerif", 1, 56)); // NOI18N
        jLabel_mostra_letra_minuscula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_mostra_letra_minuscula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 204), 1, true));

        digitacao_textfield.setFont(new java.awt.Font("SansSerif", 1, 60)); // NOI18N
        digitacao_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        digitacao_textfield.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                digitacao_textfieldCaretUpdate(evt);
            }
        });
        digitacao_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitacao_textfieldActionPerformed(evt);
            }
        });
        digitacao_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                digitacao_textfieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_digitacaoLayout = new javax.swing.GroupLayout(jPanel_digitacao);
        jPanel_digitacao.setLayout(jPanel_digitacaoLayout);
        jPanel_digitacaoLayout.setHorizontalGroup(
            jPanel_digitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_digitacaoLayout.createSequentialGroup()
                .addGroup(jPanel_digitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_mostra_letra_minuscula, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jLabel_mostra_letra_maiuscula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_digitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_digitacaoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel_digitacaoLayout.createSequentialGroup()
                        .addComponent(jLabel_texto_amostra, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                        .addGap(56, 56, 56))))
            .addComponent(digitacao_textfield)
        );
        jPanel_digitacaoLayout.setVerticalGroup(
            jPanel_digitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_digitacaoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel_digitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_digitacaoLayout.createSequentialGroup()
                        .addComponent(jLabel_mostra_letra_maiuscula, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_mostra_letra_minuscula, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_digitacaoLayout.createSequentialGroup()
                        .addComponent(jLabel_texto_amostra, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digitacao_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_gif_enter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_gif_enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/msg_1.gif"))); // NOI18N
        jLabel_gif_enter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel_gif_enterKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_comemoracaoLayout = new javax.swing.GroupLayout(jPanel_comemoracao);
        jPanel_comemoracao.setLayout(jPanel_comemoracaoLayout);
        jPanel_comemoracaoLayout.setHorizontalGroup(
            jPanel_comemoracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_comemoracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_gif_enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_comemoracaoLayout.setVerticalGroup(
            jPanel_comemoracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_comemoracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_gif_enter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_nome_do_aluno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_nome_do_aluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_nome_do_aluno.setText("nome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_comemoracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel_nome_do_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 168, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_comemoracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel_nome_do_aluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_relogio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_relogio.setText("00:00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Pontos :");

        jLabel_pontos.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel_pontos.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_pontos.setText("0");

        jButton_iniciar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton_iniciar.setText("Iniciar");
        jButton_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_iniciarActionPerformed(evt);
            }
        });

        jButton_jogador.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton_jogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario_32x32.png"))); // NOI18N
        jButton_jogador.setToolTipText("Clique para escolher o jogador");
        jButton_jogador.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario_32x32.png"))); // NOI18N
        jButton_jogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_jogadorActionPerformed(evt);
            }
        });

        jLabel_nome_jogador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Salvar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator3);

        jMenuItem7.setText("Recomeçar jogo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator4);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Exibir");
        jMenu4.setMargin(new java.awt.Insets(2, 8, 2, 8));

        jMenuItem9.setText("Alunos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Editar");

        jMenuItem6.setText("Configurar ");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator1);

        jMenuItem2.setText("Adicionar aluno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator2);

        jMenuItem5.setText("Adicionar palavra");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");
        jMenu3.setMargin(new java.awt.Insets(2, 8, 2, 8));

        jMenuItem8.setText("Ajuda");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);
        jMenu3.add(jSeparator6);

        jMenuItem4.setText("Sobre ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_digitacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_pontos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_jogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_nome_jogador, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_iniciar)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel_relogio)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_relogio)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton_iniciar)
                                .addComponent(jButton_jogador))
                            .addComponent(jLabel_nome_jogador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_digitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_pontos)))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void digitacao_textfieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_digitacao_textfieldCaretUpdate
        // TODO add your handling code here:
        if (digitacao_textfield.getText().equals(texto_amostra)) {
            digitacao_textfield.setForeground(Color.RED);
            digitacao_textfield.setEditable(false);
            digitacao_textfield.setBackground(Color.blue);
            this.jPanel_comemoracao.setVisible(true);
            this.jLabel_gif_enter.setVisible(true);
            this.jLabel_texto_amostra.setText(texto_amostra);
            this.pontos++;
            //iniciado = false;
            acerto = 0;
            this.jLabel_pontos.setText(String.valueOf(pontos));
            this.jLabel_gif_enter.grabFocus();
            if (pontos > getSessao().getJogador().getPontos()) {
                getSessao().getJogador().setPontos(pontos);
                salvarSessao();
            }
        } else {
            if (compareDigitacao(this.digitacao_textfield.getText(), this.jLabel_texto_amostra.getText())) {
                if (acerto < this.jLabel_texto_amostra.getText().length()) {
                    acerto++;
                }
            } else {
                erro++;
                erro_parcial++;
                if (erro_parcial > 2) {
                    pontos--;
                    this.jLabel_pontos.setText(String.valueOf(pontos));
                    erro_parcial = 0;
                }
            }

        }
//printObj("Jogador", getSessao().getJogador());
    }//GEN-LAST:event_digitacao_textfieldCaretUpdate

    private void digitacao_textfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_digitacao_textfieldKeyPressed
        // TODO add your handling code here:

        if (iniciado) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER && this.digitacao_textfield.getBackground().equals(Color.blue)) {
                restart();
            }
        }

    }//GEN-LAST:event_digitacao_textfieldKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        salvarSessao();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

        getjFrameCadastroAluno().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:

        getjFrameCadastroPalavra().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:

        getConfiguarSessao().setVisible(true);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_iniciarActionPerformed
        // TODO add your handling code here:
        if (this.sessao != null) {
            if (jLabel_nome_jogador.getText().length() > 0) {
                //System.out.println(this.sessao.toString());
                threadRelogio = new Thread() {

                    @Override
                    public void run() {
                        cronometro();
                    }
                };
                componentEnable(jPanel_digitacao, true);
                this.jLabel_pontos.setText("0");
                this.digitacao_textfield.grabFocus();
                this.jButton_iniciar.setEnabled(false);
                this.jButton_jogador.setEnabled(false);
                threadRelogio.start();
                iniciado = true;
                restart();
                erro = 0;
                pontos = 0;
                tempo = getSessao().getTempo() > 0 ? getSessao().getTempo() : 3;
                getSessao().getJogador().setTempo(tempo);
                this.jLabel_relogio.setText(pad(tempo) + ":00");

            } else {
                this.jButton_jogadorActionPerformed(evt);
            }

        } else {
            this.jMenuItem6ActionPerformed(evt);
        }
    }//GEN-LAST:event_jButton_iniciarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void jLabel_gif_enterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel_gif_enterKeyPressed
        // TODO add your handling code here:
        if (this.digitacao_textfield.getBackground().equals(Color.blue) && evt.getKeyCode() == KeyEvent.VK_ENTER) {
            restart();
        }
    }//GEN-LAST:event_jLabel_gif_enterKeyPressed

    private void digitacao_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitacao_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitacao_textfieldActionPerformed

    private void jButton_jogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_jogadorActionPerformed
        // TODO add your handling code here:
        getJogador().setVisible(true);

    }//GEN-LAST:event_jButton_jogadorActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        recomecar();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, new Info(), "Sobre", 1);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, new Ajuda(), "Ajuda", 3);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, TabelaDeJogadores.quadroDeJogadores(getSessao()), "Resultados", 1);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        salvarSessao();

        System.exit(0);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

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

            public void run() {
                new Ui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField digitacao_textfield;
    private javax.swing.JButton jButton_iniciar;
    private javax.swing.JButton jButton_jogador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_gif_enter;
    private javax.swing.JLabel jLabel_mostra_letra_maiuscula;
    private javax.swing.JLabel jLabel_mostra_letra_minuscula;
    private javax.swing.JLabel jLabel_nome_do_aluno;
    private javax.swing.JLabel jLabel_nome_jogador;
    private javax.swing.JLabel jLabel_pontos;
    private javax.swing.JLabel jLabel_relogio;
    private javax.swing.JLabel jLabel_texto_amostra;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_comemoracao;
    private javax.swing.JPanel jPanel_digitacao;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    // End of variables declaration//GEN-END:variables
    private Sessao sessao;
    private ControlArquivo arquivo = new ControlArquivo();
    private CadastroAluno jFrameCadastroAluno;
    private CadastroPalavra jFrameCadastroPalavra;
    private Configuracao configuarSessao;
    private EscolherJogador jogador;

    private void iniciar() {
        this.jogador_sessao = getSessao().getJogador();
        // printObj(null,getArrayPalavras());
        this.setArrayPalavras(getArrayPalavras());
    }

    private void reset_digitacao() {
        this.digitacao_textfield.setText(null);
        this.digitacao_textfield.setEditable(true);
        this.digitacao_textfield.setBackground(Color.white);
        this.digitacao_textfield.setForeground(Color.black);
        this.jLabel_relogio.setForeground(Color.black);
    }

    private void componentEnable(JComponent comp, boolean b) {
        for (int i = 0; i < comp.getComponentCount(); i++) {
            comp.getComponent(i).setEnabled(b);
        }
        this.jButton_iniciar.setEnabled(true);
        this.jButton_jogador.setEnabled(true);
    }

    private void restart() {
        reset_digitacao();
        String temp = jLabel_texto_amostra.getText();
        int palavras_count = getArrayPalavras().size();
        if (palavras_count > 0) {
            Random num = new Random();
            int pselect = num.nextInt(palavras_count);
            texto_amostra = getArrayPalavras().get(pselect).getTexto();
            if (texto_amostra.equals(temp)) {
                restart();
            }
        }
        if(texto_amostra!=null){
            this.jLabel_mostra_letra_maiuscula.setText(texto_amostra.substring(0,1).toUpperCase());
                    this.jLabel_mostra_letra_minuscula.setText(texto_amostra.substring(0,1).toLowerCase());

                    if(iniciado){
                                if(this.somfixo!=null && this.somfixo.getState()== Thread.State.RUNNABLE)
                                    this.somfixo.stop();

                              this.somfixo= new PlayWave(this.fileSom.getAbsolutePath());

                               this.somfixo.start();
                               delay();

                                String file =null;
                                try{
                                file =getClass().getResource("/som/"+ this.jLabel_mostra_letra_minuscula.getText()+".WAV").getFile();
                                }catch(Exception e){}

                                if(file!=null){
                               this.som= new PlayWave(file);
                                this.som.start();}}
}
        this.jLabel_texto_amostra.setText(texto_amostra);
        this.digitacao_textfield.grabFocus();
        this.jPanel_comemoracao.setVisible(false);
        this.jLabel_nome_do_aluno.setVisible(false);
    }

    private Sessao getSessao() {
        if (this.sessao == null) {
            this.sessao = new Sessao();
        }
        return this.sessao;
    }

    public void cronometro() {
        int segundo = 0;
        try {
            while (true) {
                if (tempo == 0 && segundo == 59) {
                    this.jLabel_relogio.setForeground(Color.RED);
                }
                if (tempo == 0 && segundo == 0) {
                    iniciado = false;
                    componentEnable(this.jPanel_digitacao, iniciado);
                    this.jLabel_relogio.setText(pad(tempo) + ":" + pad(segundo));
                    this.jLabel_nome_do_aluno.setText(getMensagem());
                    jPanel_comemoracao.setVisible(true);
                    jButton_jogador.setEnabled(true);
                    jLabel_gif_enter.setVisible(false);
                    this.jLabel_nome_do_aluno.setVisible(true);
                    if (getSessao().getJogador().getPontos() < pontos) {
                        getSessao().getJogador().setTempo(getSessao().getTempo());
                        getSessao().getJogador().setPontos(pontos);
                        salvarSessao();
                    }
                    threadRelogio.stop();
                    return;
                }
                Thread.sleep(1000);
                if (segundo == 0) {
                    tempo--;
                    segundo = 59;
                } else {
                    segundo--;
                }
                this.jLabel_relogio.setText(pad(tempo) + ":" + pad(segundo));
            }
        } catch (InterruptedException ex) {
        }
    }

    public String pad(int num) {
        if (num < 10) {
            return "0" + num;
        }
        return String.valueOf(num);
    }

    private boolean carregarDados() {
        this.sessao = (Sessao) arquivo.lerArquivo(this.file);
        return sessao != null;
    }

    private Aluno getJogadorSessao() {
        if (this.jogador_sessao == null) {
            this.jogador_sessao = new Aluno();
        }

        return jogador_sessao;
    }

    private void salvarSessao() {
        arquivo.salvar(this.getSessao(), this.file, EXT);
    }

    private String getMensagem() {
        if (pontos == 0) {
            return this.getSessao().getJogador().getNome() + "! Você não fez nenhum ponto!";
        } else if (pontos > 0 && pontos < 5) {
            return this.getSessao().getJogador().getNome() + "! Você precisa treinar mais!";
        } else if (pontos > 5 && pontos < 15) {
            return this.getSessao().getJogador().getNome() + "! Você foi muito bem!";
        } else if (pontos > 10 && pontos < 25) {
            return this.getSessao().getJogador().getNome() + "! Você foi ótimo!";
        } else if (pontos > 20 && erro == 0) {
            return this.getSessao().getJogador().getNome() + "! Você não errouu nada ...PARABÉNS!";
        }
        return "";
    }

    private Configuracao getConfiguarSessao() {
        if (this.configuarSessao == null) {
            this.configuarSessao = new Configuracao(getSessao());
        }
        return configuarSessao;
    }

    private CadastroAluno getjFrameCadastroAluno() {
        if (this.jFrameCadastroAluno == null) {
            this.jFrameCadastroAluno = new CadastroAluno(getSessao());
        }
        return jFrameCadastroAluno;
    }

    private CadastroPalavra getjFrameCadastroPalavra() {
        if (jFrameCadastroPalavra == null) {
            this.jFrameCadastroPalavra = new CadastroPalavra(getSessao());
        }
        return jFrameCadastroPalavra;
    }

    public EscolherJogador getJogador() {
        if (jogador == null) {
            this.jogador = new EscolherJogador(getSessao(), this.jLabel_nome_jogador);
        }
        jogador.atualizar(getSessao());
        return jogador;
    }

    public void printObj(String descr, Object obj) {
        System.out.println(descr + " : " + obj.toString());
    }

    public void printInt(String descr, int num) {
        System.out.println(descr + " : " + num);

    }

    private void setArrayPalavras(List<Palavra> palavras) {

        if (palavras != null) {
            this.array_palavras = palavras;
        }


    }

    private List<Palavra> getArrayPalavras() {
        int nivel = getSessao().getNivel() == 0 ? 1 : getSessao().getNivel();
        int tema = getSessao().getTema() == 0 ? 1 : getSessao().getTema();
        return this.getSessao().getListPalavras(nivel, tema);
    }

    private void recomecar() {
        if (iniciado) {
            iniciado = false;
            this.acerto = 0;
            this.erro = 0;
            this.erro_parcial = 0;
            this.jLabel_pontos.setText("0");
            this.tempo = getSessao().getTempo();
            this.jLabel_relogio.setText(pad(this.tempo) + ":00");
            this.jLabel_relogio.setForeground(Color.black);
            componentEnable(jPanel_digitacao, iniciado);
            threadRelogio.stop();

        }

    }

    private boolean validarNivel(KeyEvent evt) {
        if (this.getSessao().getNivel() == 2) {
            if (evt.getKeyCode() == KeyEvent.VK_SHIFT
                    || evt.getKeyCode() == KeyEvent.VK_LEFT
                    || evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                return false;
            }
        } else if (this.getSessao().getNivel() > 2) {
            if (evt.getKeyCode() == KeyEvent.VK_SHIFT
                    || evt.getKeyCode() == KeyEvent.VK_DEAD_ACUTE
                    || evt.getKeyCode() == KeyEvent.VK_LEFT
                    || evt.getKeyCode() == KeyEvent.VK_RIGHT
                    || evt.getKeyCode() == KeyEvent.VK_DEAD_TILDE
                    || evt.getKeyCode() == KeyEvent.VK_ALT
                    || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE
                    || evt.getKeyCode() == KeyEvent.VK_ENTER) {
                return false;
            }
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_LEFT
                    || evt.getKeyCode() == KeyEvent.VK_RIGHT
                    || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE
                    || evt.getKeyCode() == KeyEvent.VK_ENTER) {
                return false;
            }
        }
        return true;
    }
    String ch;
    public boolean compareDigitacao(String str1, String str2) {
        int tam = str1.length();
        for (int i = 0; i < tam; i++) {
            if (i == str2.length()) {
                break;
            }
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
            ch =str2.charAt(i+1)+"";
            this.jLabel_mostra_letra_maiuscula.setText(ch.toUpperCase());
                                this.jLabel_mostra_letra_minuscula.setText(ch.toLowerCase());

                                   if(this.somfixo !=null && this.somfixo.getState()== Thread.State.RUNNABLE)
                                    this.somfixo.stop();

                                if(this.som !=null && this.som.getState()== Thread.State.RUNNABLE)
                                    this.som.stop();



                                String file =null;
                                try{
                                file =getClass().getResource("/som/"+ch.toLowerCase()+".WAV").getFile();
                                }catch(Exception e){}

                                if(file!=null){

                               this.som= new PlayWave(file);


                                this.som.start();}


        }

        return true;
    }


    private void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
