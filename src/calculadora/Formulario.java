package calculadora;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }
    Double valor1, valor2;
    String sinal;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        botao9 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botaoMais = new javax.swing.JButton();
        botaoCE = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botaoMenos = new javax.swing.JButton();
        botaoC = new javax.swing.JButton();
        botaoMultiplicar = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botaoDividir = new javax.swing.JButton();
        botaoPonto = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        painelDeCima = new javax.swing.JPanel();
        nomeCalculadora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        botao9.setText("9");
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botao7.setText("7");
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setText("8");
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botaoMais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoMais.setText("+");
        botaoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaisActionPerformed(evt);
            }
        });

        botaoCE.setText("CE");
        botaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCEActionPerformed(evt);
            }
        });

        botao6.setText("6");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao4.setText("4");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setText("5");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botaoMenos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoMenos.setText("-");
        botaoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenosActionPerformed(evt);
            }
        });

        botaoC.setText("C");
        botaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCActionPerformed(evt);
            }
        });

        botaoMultiplicar.setText("X");
        botaoMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicarActionPerformed(evt);
            }
        });

        botaoIgual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoIgual.setText("=");
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });

        botao2.setText("2");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setText("3");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao1.setText("1");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botaoDividir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoDividir.setText("÷");
        botaoDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDividirActionPerformed(evt);
            }
        });

        botaoPonto.setText(".");
        botaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontoActionPerformed(evt);
            }
        });

        botao0.setText("0");
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        painelDeCima.setBackground(new java.awt.Color(0, 153, 153));

        nomeCalculadora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nomeCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        nomeCalculadora.setText("Calculadora");

        javax.swing.GroupLayout painelDeCimaLayout = new javax.swing.GroupLayout(painelDeCima);
        painelDeCima.setLayout(painelDeCimaLayout);
        painelDeCimaLayout.setHorizontalGroup(
            painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDeCimaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomeCalculadora)
                .addGap(143, 143, 143))
        );
        painelDeCimaLayout.setVerticalGroup(
            painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeCimaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nomeCalculadora)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDeCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelDeCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "7");
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "9");
    }//GEN-LAST:event_botao9ActionPerformed

    private void botaoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaisActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtResultado.getText());
        sinal = "soma";
        txtResultado.setText("");
    }//GEN-LAST:event_botaoMaisActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "6");
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "4");
    }//GEN-LAST:event_botao4ActionPerformed

    private void botaoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenosActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtResultado.getText());
        sinal = "subtrair";
        txtResultado.setText("");
    }//GEN-LAST:event_botaoMenosActionPerformed

    private void botaoMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicarActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtResultado.getText());
        sinal = "multiplicar";
        txtResultado.setText("");
    }//GEN-LAST:event_botaoMultiplicarActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "3");
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "1");
    }//GEN-LAST:event_botao1ActionPerformed

    private void botaoDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDividirActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtResultado.getText());
        sinal = "dividir";
        txtResultado.setText("");
    }//GEN-LAST:event_botaoDividirActionPerformed

    private void botaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontoActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ ".");
    }//GEN-LAST:event_botaoPontoActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "0");
    }//GEN-LAST:event_botao0ActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "2");
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "5");
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+ "8");
    }//GEN-LAST:event_botao8ActionPerformed

    private void botaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCEActionPerformed
        // TODO add your handling code here:
       txtResultado.setText ("");
    }//GEN-LAST:event_botaoCEActionPerformed

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        // TODO add your handling code here:
        valor2 = Double.parseDouble(txtResultado.getText());
        if (sinal == "soma"){
            txtResultado.setText(String.valueOf (valor1 + valor2));
        }
        if (sinal == "subtrair"){
            txtResultado.setText(String.valueOf (valor1 - valor2));
        }
        if (sinal == "multiplicar"){
            txtResultado.setText(String.valueOf (valor1 * valor2));
        }
        if (sinal == "dividir"){
            txtResultado.setText(String.valueOf (valor1 / valor2));
        }
    }//GEN-LAST:event_botaoIgualActionPerformed

    private void botaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCActionPerformed
        // TODO add your handling code here:
        valor1 = null;
        valor2 = null;
        txtResultado.setText("");
    }//GEN-LAST:event_botaoCActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoC;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDividir;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMais;
    private javax.swing.JButton botaoMenos;
    private javax.swing.JButton botaoMultiplicar;
    private javax.swing.JButton botaoPonto;
    private javax.swing.JLabel nomeCalculadora;
    private javax.swing.JPanel painelDeCima;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
