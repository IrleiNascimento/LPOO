/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

/**
 *
 * @author Irlei
 */
public class PainelResultado extends javax.swing.JPanel {
    /**
     * Creates new form PainelResultado
     */
    public PainelResultado(Ui.Resultado r) {
        initComponents();

        this.jLabel_acert_b_direito.setText(String.valueOf(r.pontos_d));
        this.jLabel_acert_b_esquerdo.setText(String.valueOf(r.pontos_e));
        this.jLabel_err_b_direito.setText(String.valueOf(r.erros_d));
        this.jLabel_err_b_esquerdo.setText(String.valueOf(r.erros_e));
        this.jLabel_nome.setText(r.jogador);
        this.jLabel_nota.setText(String.valueOf(r.getMedia()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_nome = new javax.swing.JLabel();
        jLabel_acert_b_direito = new javax.swing.JLabel();
        jLabel_acert_b_esquerdo = new javax.swing.JLabel();
        jLabel_err_b_direito = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_err_b_esquerdo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_nota = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Jogador :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Botão Direito  acertos:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Botão Esquerdo acertos:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Botão Direito erros:");

        jLabel_nome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_nome.setText("jLabel5");

        jLabel_acert_b_direito.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_acert_b_direito.setText("jLabel6");

        jLabel_acert_b_esquerdo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_acert_b_esquerdo.setText("jLabel7");

        jLabel_err_b_direito.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_err_b_direito.setText("jLabel8");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Botão Esquerdo erros:");

        jLabel_err_b_esquerdo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_err_b_esquerdo.setText("jLabel6");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Nota :");

        jLabel_nota.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_nota.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jLabel_acert_b_direito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_acert_b_esquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_err_b_direito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_err_b_esquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_nota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_acert_b_direito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_acert_b_esquerdo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_err_b_direito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_err_b_esquerdo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_nota))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_acert_b_direito;
    private javax.swing.JLabel jLabel_acert_b_esquerdo;
    private javax.swing.JLabel jLabel_err_b_direito;
    private javax.swing.JLabel jLabel_err_b_esquerdo;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_nota;
    // End of variables declaration//GEN-END:variables
}
