package swingvetor;

import javax.swing.DefaultListModel;
import java.util.Arrays;

public class TelaVetor extends javax.swing.JFrame {
    int vetor[] = new int[10];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;
    
    public TelaVetor() {
        initComponents();
        for(int contador = 0; contador < vetor.length; contador++){
            lista.addElement(vetor[contador]);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        spinnerNumero = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        botaoAdicionar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoOrdenar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelPosicao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVetor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spinnerNumero.setFont(new java.awt.Font("Verdana", 1, 18));
        spinnerNumero.setModel(new javax.swing.SpinnerNumberModel());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); 
        jLabel1.setText("DESAFIO VETOR");

        botaoAdicionar.setFont(new java.awt.Font("Times New Roman", 3, 18));
        botaoAdicionar.setText("ADICIONAR");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoRemover.setFont(new java.awt.Font("Times New Roman", 3, 18)); 
        botaoRemover.setText("REMOVER");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoOrdenar.setFont(new java.awt.Font("Times New Roman", 3, 18)); 
        botaoOrdenar.setText("ORDENAR");
        botaoOrdenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOrdenarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18));
        jLabel2.setText("VETOR");

        labelPosicao.setFont(new java.awt.Font("Verdana", 1, 24)); 
        labelPosicao.setText("[ 0 ]");

        listaVetor.setModel(lista);
        listaVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaVetor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labelPosicao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinnerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoRemover)
                            .addComponent(botaoAdicionar)
                            .addComponent(botaoOrdenar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(labelPosicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAdicionar))
                        .addGap(18, 18, 18)
                        .addComponent(botaoRemover)
                        .addGap(18, 18, 18)
                        .addComponent(botaoOrdenar)
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );

        pack();
    }

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
       vetor[selecionado] = Integer.parseInt(spinnerNumero.getValue().toString());
       lista.removeAllElements();//remove todos os elementos da lista
       for(int contador = 0; contador < vetor.length; contador++ ){
           lista.addElement(vetor[contador]);//escreve o valor do vetor na posicão do contador
       }
    }

    private void listaVetorMouseClicked(java.awt.event.MouseEvent evt) {
        selecionado = listaVetor.getSelectedIndex();//pega o item que esta selecionado na listaVetor
        labelPosicao.setText("[ " + selecionado + " ]"));//atribui ao labelPosicao
    }

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        vetor[selecionado] = 0;
        lista.removeAllElements();
        for(int contador = 0; contador < vetor.length; contador++ ){
           lista.addElement(vetor[contador]);
        }
    }
    private void botaoOrdenarActionPerformed(java.awt.event.ActionEvent evt) {
        Arrays.sort(vetor);
        lista.removeAllElements();
        for(int contador = 0; contador < vetor.length; contador++ ){
           lista.addElement(vetor[contador]);
        }
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVetor().setVisible(true);
            }
        });
    }

    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoOrdenar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPosicao;
    private javax.swing.JList<String> listaVetor;
    private javax.swing.JSpinner spinnerNumero;
}
