package swingFuncao;

public class TelaFatorialFuncao extends javax.swing.JFrame {

    public TelaFatorialFuncao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spinnerNumero = new javax.swing.JSpinner();
        botaoFatorial = new javax.swing.JButton();
        labelCalculo = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); 
        jLabel1.setText("DESAFIO FUNCÃO FATORIAL");

        spinnerNumero.setFont(new java.awt.Font("Verdana", 1, 24)); 
        spinnerNumero.setModel(new javax.swing.SpinnerNumberModel());

        botaoFatorial.setFont(new java.awt.Font("Verdana", 1, 18)); 
        botaoFatorial.setText("! = ");
        botaoFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFatorialActionPerformed(evt);
            }
        });

        labelCalculo.setFont(new java.awt.Font("Verdana", 1, 24)); 
        labelCalculo.setText("Cálculo");

        labelResultado.setFont(new java.awt.Font("Verdana", 1, 24)); 
        labelResultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinnerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoFatorial))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCalculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelResultado)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFatorial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCalculo)
                    .addComponent(labelResultado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void botaoFatorialActionPerformed(java.awt.event.ActionEvent evt) {
        int numero = Integer.parseInt(spinnerNumero.getValue().toString());
        Fatorial fatorial1 = new Fatorial();
        
        fatorial1.setFatorial(numero);
        labelCalculo.setText(fatorial1.getCalculo());
        labelResultado.setText(Integer.toString(fatorial1.getFatorial()));
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
            java.util.logging.Logger.getLogger(TelaFatorialFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFatorialFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFatorialFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFatorialFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFatorialFuncao().setVisible(true);
            }
        });
    }

    private javax.swing.JButton botaoFatorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCalculo;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JSpinner spinnerNumero;
}
