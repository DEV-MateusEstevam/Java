package destructor.avaj;

public class OlaMundoJava extends javax.swing.JFrame {

    public OlaMundoJava() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        labelMensagem = new javax.swing.JLabel();
        botaoMensagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMensagem.setFont(new java.awt.Font("Verdana", 2, 24)); 
        labelMensagem.setForeground(new java.awt.Color(0, 0, 255));
        labelMensagem.setText("Aqui vai aparecer a mensagem...");

        botaoMensagem.setFont(new java.awt.Font("Verdana", 3, 18)); 
        botaoMensagem.setText("Clique aqui!");
        botaoMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMensagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labelMensagem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(botaoMensagem)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(labelMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(botaoMensagem)
                .addGap(50, 50, 50))
        );

        pack();
    }

    private void botaoMensagemActionPerformed(java.awt.event.ActionEvent evt) {
        labelMensagem.setText("Olá Mundo!!!");
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlaMundoJava().setVisible(true);
            }
        });
    }

    private javax.swing.JButton botaoMensagem;
    private javax.swing.JLabel labelMensagem;
}
