package contadorswing;
import javax.swing.DefaultListModel;
public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sliderFim = new javax.swing.JSlider();
        sliderPasso = new javax.swing.JSlider();
        labelInicio = new javax.swing.JLabel();
        labelFim = new javax.swing.JLabel();
        labelPasso = new javax.swing.JLabel();
        botaoContar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaResultado = new javax.swing.JList<>();
        sliderInicio = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTADOR SWING");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("INICIO:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("FIM:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("PASSO:");

        sliderFim.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        sliderFim.setMaximum(20);
        sliderFim.setMinimum(6);
        sliderFim.setValue(6);
        sliderFim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderFimStateChanged(evt);
            }
        });

        sliderPasso.setMaximum(5);
        sliderPasso.setMinimum(1);
        sliderPasso.setValue(1);
        sliderPasso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPassoStateChanged(evt);
            }
        });

        labelInicio.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelInicio.setForeground(new java.awt.Color(255, 0, 0));
        labelInicio.setText("0");

        labelFim.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelFim.setForeground(new java.awt.Color(255, 0, 0));
        labelFim.setText("6");

        labelPasso.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelPasso.setForeground(new java.awt.Color(255, 0, 0));
        labelPasso.setText("1");

        botaoContar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        botaoContar.setForeground(new java.awt.Color(0, 0, 255));
        botaoContar.setText("CONTAR");
        botaoContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaResultado);

        sliderInicio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        sliderInicio.setMaximum(20);
        sliderInicio.setValue(0);
        sliderInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderInicioStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sliderPasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPasso))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sliderFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelFim))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sliderInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelInicio))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(botaoContar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelInicio)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(labelFim, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sliderInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sliderFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(sliderPasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPasso))
                        .addGap(20, 20, 20)
                        .addComponent(botaoContar))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderFimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderFimStateChanged
        int fim = sliderFim.getValue();
        labelFim.setText(Integer.toString(fim));
    }//GEN-LAST:event_sliderFimStateChanged

    private void sliderPassoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPassoStateChanged
        int passo = sliderPasso.getValue();
        labelPasso.setText(Integer.toString(passo));
    }//GEN-LAST:event_sliderPassoStateChanged

    private void sliderInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderInicioStateChanged
        int inicio = sliderInicio.getValue();
        labelInicio.setText(Integer.toString(inicio));
    }//GEN-LAST:event_sliderInicioStateChanged

    private void botaoContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContarActionPerformed
        int inicio = sliderInicio.getValue();
        int fim = sliderFim.getValue();
        int passo = sliderPasso.getValue();
        
        DefaultListModel lista = new DefaultListModel();
        
        for(int contador = inicio; contador <= fim; contador += passo){
           lista.addElement(contador);
        }
        
        listaResultado.setModel(lista);//setModel pq a propriedade da tela é uma lista
    }//GEN-LAST:event_botaoContarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoContar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFim;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelPasso;
    private javax.swing.JList<String> listaResultado;
    private javax.swing.JSlider sliderFim;
    private javax.swing.JSlider sliderInicio;
    private javax.swing.JSlider sliderPasso;
    // End of variables declaration//GEN-END:variables
}
