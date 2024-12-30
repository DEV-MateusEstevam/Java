package swingfatorial;

public class TelaFatorial extends javax.swing.JFrame {

    public TelaFatorial() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spinnerNumero = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        labelCalculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Descobrindo o Fatorial");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Selecione um número:");

        spinnerNumero.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        spinnerNumero.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spinnerNumero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerNumeroStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("! =");

        labelResultado.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelResultado.setForeground(new java.awt.Color(255, 0, 0));
        labelResultado.setText("1");

        labelCalculo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelCalculo.setForeground(new java.awt.Color(0, 0, 204));
        labelCalculo.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinnerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCalculo))
                    .addComponent(labelResultado))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(labelCalculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelResultado)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spinnerNumeroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNumeroStateChanged
        int numero = Integer.parseInt(spinnerNumero.getValue().toString());
        
        int contador = numero;
        String mostraCalculo = "";
        int fatorial = 1;
        
        while(contador >=1){
            fatorial *= contador;          
            if(contador != 1){
                mostraCalculo += contador +" X ";
            }else{
                mostraCalculo += contador + " = ";
            }
            contador--;
            
        }
        labelCalculo.setText(mostraCalculo);
        labelResultado.setText(Integer.toString(fatorial));
    }//GEN-LAST:event_spinnerNumeroStateChanged

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFatorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelCalculo;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JSpinner spinnerNumero;
    // End of variables declaration//GEN-END:variables
}
