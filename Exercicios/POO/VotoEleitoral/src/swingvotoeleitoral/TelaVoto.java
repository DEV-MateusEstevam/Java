package swingvotoeleitoral;
import java.time.LocalDate;
import java.util.Calendar;
public class TelaVoto extends javax.swing.JFrame {

    public TelaVoto() {
        initComponents();
        int atualAno = LocalDate.now().getYear();
        labelAtual.setText(Integer.toString(atualAno));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        labelAtual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelSituacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); 
        jLabel1.setText("VOTO ELEITORAL");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel2.setText("Digite o ano do seu nascimento:");

        txtNascimento.setFont(new java.awt.Font("Verdana", 1, 14)); 

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel3.setText("Estamos no ano de:");

        btnCalcular.setFont(new java.awt.Font("Verdana", 3, 18)); 
        btnCalcular.setText("CALCULAR IDADE");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        labelAtual.setFont(new java.awt.Font("Verdana", 1, 18)); 

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel5.setText("Idade:");

        labelIdade.setFont(new java.awt.Font("Verdana", 1, 18)); 
        labelIdade.setText("0");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); 
        jLabel7.setText("Situação:");

        labelSituacao.setFont(new java.awt.Font("Verdana", 1, 18)); 
        labelSituacao.setText("<vazio>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSituacao))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCalcular)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(labelAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNascimento))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelSituacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        Calendar calendario = Calendar.getInstance();
        
        int anoAtual = calendario.get(Calendar.YEAR);
        
        int nascimento = Integer.parseInt(txtNascimento.getText());
        
        int idade = anoAtual - nascimento;
        labelIdade.setText(Integer.toString(idade));
        
        String situacao = ((idade>=16 && idade<18) || (idade >=70)) ? "VOTO OPCIONAL":"VOTO OBRIGATÓRIO";
        labelSituacao.setText(situacao);
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVoto().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelAtual;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelSituacao;
    private javax.swing.JTextField txtNascimento;
}
