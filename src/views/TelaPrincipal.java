/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import eventos.clBotoesTelaPrincipal;
import java.awt.Dimension;
import javax.swing.JInternalFrame;


public class TelaPrincipal extends javax.swing.JFrame {

    private clBotoesTelaPrincipal eventosBotao = new clBotoesTelaPrincipal(this);
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        
        jMICadastroPessoa.addActionListener(eventosBotao);
        jMICadastroRenda.addActionListener(eventosBotao);
        jMICadastroDividas.addActionListener(eventosBotao);
        jMISobre.addActionListener(eventosBotao);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JAreaDeTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMICadastroPessoa = new javax.swing.JMenuItem();
        jMICadastroRenda = new javax.swing.JMenuItem();
        jMICadastroDividas = new javax.swing.JMenuItem();
        Jmenu2 = new javax.swing.JMenu();
        jMISobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CFP - Controle Financeiro Pessoal");
        setExtendedState(6);

        jMenu1.setText("Cadastros");

        jMICadastroPessoa.setText("Cadastro de Pessoa");
        jMICadastroPessoa.setActionCommand("cadastro_pessoa");
        jMenu1.add(jMICadastroPessoa);

        jMICadastroRenda.setText("Cadastro de Renda");
        jMICadastroRenda.setActionCommand("cadastro_renda");
        jMenu1.add(jMICadastroRenda);

        jMICadastroDividas.setText("Cadastro de Dividas");
        jMICadastroDividas.setActionCommand("cadastro_dividas");
        jMenu1.add(jMICadastroDividas);

        jMenuBar1.add(jMenu1);

        Jmenu2.setText("Ajuda");

        jMISobre.setText("Sobre");
        jMISobre.setActionCommand("sobre");
        Jmenu2.add(jMISobre);

        jMenuBar1.add(Jmenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new TelaPrincipal().setVisible(true);
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                tela.abrirLogin();
                
            }
        });
    }
    
    public void abrirLogin()
    {
          TelaLogin login = new TelaLogin(this, true);
          login.setVisible(true);
    }

    public void abrirJanelaCadastroPessoa() {
        CadastroPessoa novo = new CadastroPessoa();
        JAreaDeTrabalho.add(novo);
        centralizaForm(novo);
        novo.setVisible(true);
    }

    public void abrirJanelaCadastroDivida() {
        CadastroDivida novo = new CadastroDivida();
        JAreaDeTrabalho.add(novo);
        centralizaForm(novo);
        novo.setVisible(true);
    }

    public void abrirJanelaRenda() {
        CadastroRenda novo = new CadastroRenda();
        JAreaDeTrabalho.add(novo);
        centralizaForm(novo);
        novo.setVisible(true);
    }

    public void abrirJanelaSobre() {
        Sobre novo = new Sobre();
        JAreaDeTrabalho.add(novo);
        centralizaForm(novo);
        novo.setVisible(true);
    }
    
    
    
    //Função que centraliza internaljframe
    private void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = JAreaDeTrabalho.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JAreaDeTrabalho;
    private javax.swing.JMenu Jmenu2;
    private javax.swing.JMenuItem jMICadastroDividas;
    private javax.swing.JMenuItem jMICadastroPessoa;
    private javax.swing.JMenuItem jMICadastroRenda;
    private javax.swing.JMenuItem jMISobre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
