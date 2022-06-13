package principal;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import principal.Conexao;

public class JMain extends javax.swing.JFrame {
   private boolean verifica = false;
    
    public JMain() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/group.png")));
    }
    
    private boolean checar(){
        if(text_matricula.getText() == "" && text_nome.getText() == "" && text_email.getText() == "" && text_idade.getText() == ""){
            JOptionPane.showMessageDialog(null, "Dados Inválidos", "Algum dado está inválido verifique se todos os campos estão preenchidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
    
    private void limpar(){
        text_matricula.setText("");
        text_nome.setText("");
        text_email.setText("");
        text_idade.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Dados = new javax.swing.JPanel();
        label_matricula = new javax.swing.JLabel();
        text_matricula = new javax.swing.JTextField();
        label_nome = new javax.swing.JLabel();
        text_nome = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        text_email = new javax.swing.JTextField();
        label_idade = new javax.swing.JLabel();
        text_idade = new javax.swing.JTextField();
        button_buscar = new javax.swing.JButton();
        button_incluir = new javax.swing.JButton();
        button_alterar = new javax.swing.JButton();
        button_excluir = new javax.swing.JButton();
        button_limpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção Alunos");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(440, 270));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        Panel_Dados.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificação"));
        Panel_Dados.setMaximumSize(new java.awt.Dimension(440, 270));
        Panel_Dados.setMinimumSize(new java.awt.Dimension(440, 270));
        Panel_Dados.setName(""); // NOI18N
        Panel_Dados.setPreferredSize(new java.awt.Dimension(440, 270));

        label_matricula.setText("Matricula");

        label_nome.setText("Nome");

        label_email.setText("Email");

        label_idade.setText("Idade");

        button_buscar.setText("Buscar");
        button_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_buscarMouseClicked(evt);
            }
        });

        button_incluir.setText("Incluir");
        button_incluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_incluirMouseClicked(evt);
            }
        });

        button_alterar.setText("Alterar");
        button_alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_alterarMouseClicked(evt);
            }
        });

        button_excluir.setText("Excluir");
        button_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_excluirMouseClicked(evt);
            }
        });

        button_limpar.setText("Limpar");
        button_limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_limparMouseClicked(evt);
            }
        });

        jLabel1.setText("Ações");

        javax.swing.GroupLayout Panel_DadosLayout = new javax.swing.GroupLayout(Panel_Dados);
        Panel_Dados.setLayout(Panel_DadosLayout);
        Panel_DadosLayout.setHorizontalGroup(
            Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DadosLayout.createSequentialGroup()
                .addGroup(Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_DadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_DadosLayout.createSequentialGroup()
                                .addGroup(Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_matricula)
                                    .addComponent(label_nome)
                                    .addComponent(label_email)
                                    .addComponent(label_idade))
                                .addGap(18, 18, 18)
                                .addGroup(Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text_nome)
                                    .addGroup(Panel_DadosLayout.createSequentialGroup()
                                        .addComponent(text_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                        .addComponent(button_buscar))
                                    .addComponent(text_email)
                                    .addComponent(text_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)))
                    .addGroup(Panel_DadosLayout.createSequentialGroup()
                        .addComponent(button_incluir)
                        .addGap(18, 18, 18)
                        .addComponent(button_alterar)
                        .addGap(18, 18, 18)
                        .addComponent(button_excluir)
                        .addGap(18, 18, 18)
                        .addComponent(button_limpar)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        Panel_DadosLayout.setVerticalGroup(
            Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_matricula)
                    .addComponent(text_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_buscar))
                .addGap(18, 18, 18)
                .addGroup(Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(text_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_email)
                    .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_idade)
                    .addComponent(text_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_incluir)
                    .addComponent(button_alterar)
                    .addComponent(button_excluir)
                    .addComponent(button_limpar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_limparMouseClicked
        text_matricula.setText("");
        text_nome.setText("");
        text_email.setText("");
        text_idade.setText("");
        JOptionPane.showMessageDialog(null, "Campos limpos com sucesso");
    }//GEN-LAST:event_button_limparMouseClicked

    private void button_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_excluirMouseClicked
        verifica = checar();
        if(verifica = true){
        Conexao cn = new Conexao();
        cn.excluir(text_matricula.getText(),text_nome.getText(),text_email.getText(),text_idade.getText());
        limpar();
        }
    }//GEN-LAST:event_button_excluirMouseClicked

    private void button_alterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_alterarMouseClicked
        verifica = checar();
        if(verifica = true){
        Conexao cn = new Conexao();
        cn.alterar(text_matricula.getText(),text_nome.getText(),text_email.getText(),text_idade.getText());
        limpar();
        }
    }//GEN-LAST:event_button_alterarMouseClicked

    private void button_incluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_incluirMouseClicked
        verifica = checar();
        if(verifica = true){
        Conexao cn = new Conexao();
        cn.incluir(text_matricula.getText(),text_nome.getText(),text_email.getText(),text_idade.getText());
        limpar();
        }
    }//GEN-LAST:event_button_incluirMouseClicked

    private void button_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_buscarMouseClicked
        Conexao cn = new Conexao();
        String[] dados = new String[4];
        dados = cn.buscar(text_matricula.getText(),text_nome.getText(),text_email.getText(),text_idade.getText());
        text_matricula.setText(dados[0]);
        text_nome.setText(dados[1]);
        text_email.setText(dados[2]);
        text_idade.setText(dados[3]);
        
    }//GEN-LAST:event_button_buscarMouseClicked

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
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Dados;
    private javax.swing.JButton button_alterar;
    private javax.swing.JButton button_buscar;
    private javax.swing.JButton button_excluir;
    private javax.swing.JButton button_incluir;
    private javax.swing.JButton button_limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_idade;
    private javax.swing.JLabel label_matricula;
    private javax.swing.JLabel label_nome;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_idade;
    private javax.swing.JTextField text_matricula;
    private javax.swing.JTextField text_nome;
    // End of variables declaration//GEN-END:variables
}
