/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author pap08
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        painel.setVisible(false);
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
        Sasuke = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Naruto = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        def = new javax.swing.JLabel();
        atk = new javax.swing.JLabel();
        life = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        es = new javax.swing.JLabel();
        ut = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chakra = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        despertar = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        esconder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESCOLHA UM PERSONAGEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 599, 76));

        Sasuke.setBackground(new java.awt.Color(0, 51, 102));
        Sasuke.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        Sasuke.setForeground(new java.awt.Color(204, 204, 204));
        Sasuke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sasuke MS.png"))); // NOI18N
        Sasuke.setText("Sasuke MS");
        Sasuke.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Sasuke.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Sasuke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SasukeActionPerformed(evt);
            }
        });
        getContentPane().add(Sasuke, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 281, 220));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        Naruto.setBackground(new java.awt.Color(204, 204, 204));
        Naruto.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        Naruto.setForeground(new java.awt.Color(255, 51, 0));
        Naruto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Naruto Kid.png"))); // NOI18N
        Naruto.setText("<html>Naruto Kid</html>");
        Naruto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Naruto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Naruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NarutoActionPerformed(evt);
            }
        });
        getContentPane().add(Naruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 300, 220));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("VIDA");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("ATAQUE");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("DEFESA");

        def.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        def.setText("????");

        atk.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        atk.setText("????");

        life.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        life.setText("????");

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("CHAKRA");

        es.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        es.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        es.setText("?");

        ut.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        ut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ut.setText("?");

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 153));
        jLabel14.setText("ULTIMATES");

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("ESPECIAIS");

        chakra.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        chakra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chakra.setText("????");

        jLabel17.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 0));
        jLabel17.setText("DESPERTAR:");

        despertar.setFont(new java.awt.Font("Tw Cen MT Condensed", 2, 36)); // NOI18N
        despertar.setText("????");

        nome.setFont(new java.awt.Font("Snap ITC", 3, 36)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome.setText("...");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(def, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(atk, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(life, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(es, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel12))))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(chakra, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(despertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(life)
                                .addGap(7, 7, 7))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(chakra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atk)
                            .addComponent(es)
                            .addComponent(jLabel12))
                        .addGap(4, 4, 4))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(def)
                            .addComponent(jLabel14)
                            .addComponent(ut))
                        .addGap(1, 1, 1)))
                .addGap(3, 3, 3)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(despertar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 660, 250));

        esconder.setBackground(new java.awt.Color(0, 0, 0));
        esconder.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        esconder.setForeground(new java.awt.Color(255, 255, 255));
        esconder.setText("ESCONDER");
        esconder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esconderActionPerformed(evt);
            }
        });
        getContentPane().add(esconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NarutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NarutoActionPerformed
        life.setText("920");
        atk.setText("92");
        def.setText("100");
        chakra.setText("3000");
        es.setText("6");
        ut.setText("3");
        nome.setText("NARUTO KID (Classe -> E)");
        despertar.setText("Naruto 1 Tail");
        painel.setVisible(true);
    }//GEN-LAST:event_NarutoActionPerformed

    private void SasukeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SasukeActionPerformed
        life.setText("980");
        atk.setText("98");
        def.setText("100");
        chakra.setText("3000");
        es.setText("6");
        ut.setText("3");
        nome.setText("SASUKE MS (Classe -> B)");
        despertar.setText("Susano'o");
        painel.setVisible(true);
    }//GEN-LAST:event_SasukeActionPerformed

    private void esconderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esconderActionPerformed
        painel.setVisible(false);
    }//GEN-LAST:event_esconderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Naruto;
    private javax.swing.JButton Sasuke;
    private javax.swing.JLabel atk;
    private javax.swing.JLabel chakra;
    private javax.swing.JLabel def;
    private javax.swing.JLabel despertar;
    private javax.swing.JLabel es;
    private javax.swing.JButton esconder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel life;
    private javax.swing.JLabel nome;
    private javax.swing.JPanel painel;
    private javax.swing.JLabel ut;
    // End of variables declaration//GEN-END:variables
}