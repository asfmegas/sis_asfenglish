package br.com.asfmegas.asfenglish.view;

import br.com.asfmegas.asfenglish.bean.Dados;
import br.com.asfmegas.asfenglish.dao.DadosDAO;
import br.com.asfmegas.asfenglish.util.Arquivo;
import com.sun.glass.events.KeyEvent;
import java.util.List;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexswandro Façanha
 * @since 07/01/2015
 */
public class Principal extends javax.swing.JFrame {
    private DefaultTableModel tmDados = new DefaultTableModel(null, new String[]{"Palavra","Tradução"});
    private ListSelectionModel lsmDados;
    private List<Dados> listDados;
    private String arquivo, arquivo2 = "";
    private int id = 0;
    
    public Principal() {
        setTitle("Tradução de Textos");
        
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        jtTitulo.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jtTitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtConteudo = new javax.swing.JTextArea();
        jbSalvarBanco = new javax.swing.JButton();
        jbAlterarBanco = new javax.swing.JButton();
        jbApagarBanco = new javax.swing.JButton();
        jbLmpar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jtPesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTexto = new javax.swing.JTextArea();
        jlTitulo = new javax.swing.JLabel();
        jbAbrirArq1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTexto2 = new javax.swing.JTextArea();
        jbSalvar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbAbrirArq2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtConteudo.setColumns(20);
        jtConteudo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtConteudo.setRows(5);
        jScrollPane2.setViewportView(jtConteudo);

        jbSalvarBanco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalvarBanco.setText("Salvar");
        jbSalvarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarBancoActionPerformed(evt);
            }
        });

        jbAlterarBanco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAlterarBanco.setText("Alterar");
        jbAlterarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarBancoActionPerformed(evt);
            }
        });

        jbApagarBanco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbApagarBanco.setText("Apagar");
        jbApagarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbApagarBancoActionPerformed(evt);
            }
        });

        jbLmpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbLmpar.setText("Limpar");
        jbLmpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLmparActionPerformed(evt);
            }
        });

        jtTabela.setModel(tmDados);
        jtTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmDados = jtTabela.getSelectionModel();
        lsmDados.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    selecionarLinhaTabela(jtTabela);
                }
            }
        });
        jScrollPane4.setViewportView(jtTabela);

        jtPesquisa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtPesquisa.setForeground(new java.awt.Color(153, 153, 153));
        jtPesquisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPesquisa.setText("Pesquisar");
        jtPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPesquisaFocusLost(evt);
            }
        });
        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jtTitulo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbApagarBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jbSalvarBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbLmpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAlterarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jtPesquisa))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbAlterarBanco, jbApagarBanco, jbLmpar, jbSalvarBanco});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jbAlterarBanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbApagarBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbLmpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbAlterarBanco, jbApagarBanco, jbLmpar, jbSalvarBanco});

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtTexto.setBackground(new java.awt.Color(204, 204, 204));
        jtTexto.setColumns(20);
        jtTexto.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jtTexto.setRows(5);
        jScrollPane1.setViewportView(jtTexto);

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTitulo.setText("Título");

        jbAbrirArq1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAbrirArq1.setText("Abrir");
        jbAbrirArq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbrirArq1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Transferir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAbrirArq1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(jbAbrirArq1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane1)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtTexto2.setColumns(20);
        jtTexto2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtTexto2.setRows(5);
        jScrollPane3.setViewportView(jtTexto2);

        jbSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAbrirArq2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAbrirArq2.setText("Abrir");
        jbAbrirArq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbrirArq2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAbrirArq2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbAbrirArq2, jbNovo, jbSalvar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAbrirArq2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbAbrirArq2, jbNovo, jbSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAbrirArq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbrirArq1ActionPerformed
        try{
            JFileChooser chooserArquivo = new JFileChooser();
            int escolha = chooserArquivo.showOpenDialog(getParent());
            arquivo = chooserArquivo.getSelectedFile().getAbsolutePath();
            abrirArquivo();
            
            
        }catch(Exception e){
            jtTexto.setText("Nenhum arquivo aberto");
        }  
    }//GEN-LAST:event_jbAbrirArq1ActionPerformed

    private void jtPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPesquisaFocusGained
        if(jtPesquisa.getText().equals("Pesquisar"))
            jtPesquisa.setText("");
        else
            jtPesquisa.selectAll();
    }//GEN-LAST:event_jtPesquisaFocusGained

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        if(!arquivo2.equals(""))
            salvarNovoArquivo();
        else
            jtTexto2.setText("????????Salvar como novo arquivo?????????");
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPesquisaFocusLost
        if(jtPesquisa.getText().equals("")){
            jtPesquisa.setText("Pesquisar");
        }
    }//GEN-LAST:event_jtPesquisaFocusLost

    private void jbSalvarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarBancoActionPerformed
       if(!jtTitulo.getText().equals(""))
            salvar();
    }//GEN-LAST:event_jbSalvarBancoActionPerformed

    private void jbLmparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLmparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLmparActionPerformed

    private void jbAbrirArq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbrirArq2ActionPerformed
        try{
            JFileChooser chooserArquivo = new JFileChooser();
            int escolha = chooserArquivo.showOpenDialog(getParent());
            arquivo2 = chooserArquivo.getSelectedFile().getAbsolutePath();
            abrirArquivo2();
            
            
        }catch(Exception e){
            jtTexto2.setText("Nenhum arquivo aberto");
        }
    }//GEN-LAST:event_jbAbrirArq2ActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        try{
            JFileChooser chooserArquivo = new JFileChooser();
            int escolha = chooserArquivo.showOpenDialog(getParent());
            arquivo2 = chooserArquivo.getSelectedFile().getAbsolutePath();
            salvarNovoArquivo();

        }catch(Exception e){
            jtTexto2.setText("??????????????????");
        }
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyPressed
        int codigo = evt.getKeyCode();
        if(codigo == KeyEvent.VK_ENTER){
            try{
                listarAluno();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro ao listar aluno\n"+e.getMessage());
            }
        }
    }//GEN-LAST:event_jtPesquisaKeyPressed

    private void jbApagarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbApagarBancoActionPerformed
        if(id != 0){
            apagar();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione alguma palavra para apagar");
        }
    }//GEN-LAST:event_jbApagarBancoActionPerformed

    private void jbAlterarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarBancoActionPerformed
        if(!jtTitulo.getText().equals(""))
            alterar();
        else
            JOptionPane.showMessageDialog(null, "Não há nada a ser alterado");
    }//GEN-LAST:event_jbAlterarBancoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jtTexto2.setText(jtTexto.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbAbrirArq1;
    private javax.swing.JButton jbAbrirArq2;
    private javax.swing.JButton jbAlterarBanco;
    private javax.swing.JButton jbApagarBanco;
    private javax.swing.JButton jbLmpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbSalvarBanco;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextArea jtConteudo;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTable jtTabela;
    private javax.swing.JTextArea jtTexto;
    private javax.swing.JTextArea jtTexto2;
    private javax.swing.JTextField jtTitulo;
    // End of variables declaration//GEN-END:variables
    
    private void abrirArquivo(){
        Arquivo a = new Arquivo();
        String conteudo = a.openFile(arquivo);

        jlTitulo.setText(a.getTitle(arquivo));
        jtTexto.setText(conteudo);
    }
    
    private void abrirArquivo2(){
        Arquivo a = new Arquivo();
        String conteudo = a.openFile(arquivo2);

        jtTexto2.setText(conteudo);
    }
    
    private void salvarNovoArquivo(){
        Arquivo a = new Arquivo();
        try{
            a.saveFile(arquivo2, jtTexto2.getText());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Erro ao salvar arquivo\n"+e.getMessage());
        }
    }
    
    private void salvarArquivo(){
        Arquivo a = new Arquivo();
        try{
            a.saveFile(arquivo2, jtTexto2.getText());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Erro ao salvar arquivo\n"+e.getMessage());
        }
    }
    
    private void salvar(){
        DadosDAO dao = new DadosDAO();
        Dados dados = new Dados();
        
        dados.setPalavra(jtTitulo.getText());
        dados.setTexto(jtConteudo.getText());
        
        dao.salvarDados(dados);
        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        
        try{
            listarAluno();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar dados"+e.getMessage());
        }
    }
    
    private void limparCampos(){
        jtConteudo.setText("");
        jtPesquisa.setText("Pesquisar");
        jtTitulo.setText("");
        jtConteudo.setText("");
    }
    
    private void listarAluno() throws SQLException{
        DadosDAO dao = new DadosDAO();
        if(!jtPesquisa.getText().equals("Pesquisar"))
            listDados = dao.pesquisar("%"+jtPesquisa.getText()+"%");
        else
            listDados = dao.pesquisar("%%");
        mostrarPesquisa(listDados);
    }

    private void mostrarPesquisa(List<Dados> dados) {
        while(tmDados.getRowCount() > 0){
            tmDados.removeRow(0);
        }
        if(dados.isEmpty()){
            JOptionPane.showMessageDialog(null, "Sua lista está vazia!");
        }else{
            String[] linhas = new String[]{null,null};
            for(int i=0; i < dados.size();i++){
                tmDados.addRow(linhas);
                tmDados.setValueAt(dados.get(i).getPalavra(), i, 0);
                tmDados.setValueAt(dados.get(i).getTexto(), i, 1);
            }
        }
    }
    
    private void selecionarLinhaTabela(JTable tabela) {
        if (jtTabela.getSelectedRow() != -1) {
            jtTitulo.setText(listDados.get(tabela.getSelectedRow()).getPalavra());
            jtConteudo.setText(listDados.get(tabela.getSelectedRow()).getTexto());
            id = listDados.get(tabela.getSelectedRow()).getId();
        } else {
            jtTitulo.setText("");
            jtConteudo.setText("");
        }
    }
    
    private void apagar(){
        DadosDAO dao = new DadosDAO();
        Dados dados = new Dados();
        dados.setId(id);
        dao.apagar(dados);
        try{
            listarAluno();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar dados"+e.getMessage());
        }
    }
    
    private void alterar(){
        DadosDAO dao = new DadosDAO();
        Dados dados = new Dados();
        dados.setId(id);
        dados.setPalavra(jtTitulo.getText());
        dados.setTexto(jtConteudo.getText());
        dao.alterar(dados);
        try{
                listarAluno();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar dados"+e.getMessage());
        }
    }
}
