package swingmath;

import java.lang.Math;

public class TelaMath extends javax.swing.JFrame {

    public TelaMath() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        labelPI = new javax.swing.JLabel();
        labelEXP = new javax.swing.JLabel();
        labelRaizQ = new javax.swing.JLabel();
        labelRaizC = new javax.swing.JLabel();
        labelValorA = new javax.swing.JLabel();
        labelAB = new javax.swing.JLabel();
        labelAA = new javax.swing.JLabel();
        labelAC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); 
        jLabel1.setText("Funções Math Swing");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel2.setText("Numero:");

        btnCalcular.setFont(new java.awt.Font("Verdana", 3, 14)); 
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Valor de PI:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel5.setText("Exponenciação:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel6.setText("Raiz Quadrada:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel7.setText("Raiz Cúbica:");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel8.setText("Valor Absoluto:");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel9.setText("Arrendodado para Baixo:");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel10.setText("Arredondado para Cima:");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel11.setText("Arredonda Aritméticamente:");

        txtNumero.setFont(new java.awt.Font("Verdana", 1, 18));

        labelPI.setFont(new java.awt.Font("Verdana", 1, 14)); 
        labelPI.setText("0");

        labelEXP.setFont(new java.awt.Font("Verdana", 1, 14)); 
        labelEXP.setText("0");

        labelRaizQ.setFont(new java.awt.Font("Verdana", 1, 14)); 
        labelRaizQ.setText("0");

        labelRaizC.setFont(new java.awt.Font("Verdana", 1, 14)); 
        labelRaizC.setText("0");

        labelValorA.setFont(new java.awt.Font("Verdana", 1, 14)); 
        labelValorA.setText("0");

        labelAB.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        labelAB.setText("0");

        labelAA.setFont(new java.awt.Font("Verdana", 1, 14)); 
        labelAA.setText("0");

        labelAC.setFont(new java.awt.Font("Verdana", 1, 14)); 
        labelAC.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCalcular))
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelPI)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelEXP)
                                .addComponent(labelRaizQ)
                                .addComponent(labelRaizC)
                                .addComponent(labelValorA))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAC))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAB))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelAA))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelPI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelEXP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelRaizQ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelRaizC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelValorA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelAB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelAC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelAA))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        float numero = Integer.parseInt(txtNumero.getText());
        
        float valorPI = Math.PI.getvalue(numero);
        
        labelPI.setText(string);
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMath().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelAA;
    private javax.swing.JLabel labelAB;
    private javax.swing.JLabel labelAC;
    private javax.swing.JLabel labelEXP;
    private javax.swing.JLabel labelPI;
    private javax.swing.JLabel labelRaizC;
    private javax.swing.JLabel labelRaizQ;
    private javax.swing.JLabel labelValorA;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
