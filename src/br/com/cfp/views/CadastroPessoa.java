/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cfp.views;

import br.com.cfp.classes.clExceptions;
import br.com.cfp.classes.clPessoa;
import br.com.cfp.eventos.clBotoesPessoa;
import java.awt.event.ActionListener;

/**
 *
 * @author emerson
 */
public class CadastroPessoa extends javax.swing.JInternalFrame {

    private ActionListener listener;
    private clBotoesPessoa botoes = new clBotoesPessoa(this);
    private int iCodUsuario;

    public clPessoa getPessoa() throws clExceptions {
        //alimentar o objeto com informacoes do textField
        clPessoa pessoa = new clPessoa();
        String numero = txtRG.getText().replace(".", "");

        verificaDados();
        pessoa.setiCodPessoa(Integer.parseInt(txtCodigo.getText()));
        pessoa.setStrCpf(txtCpf.getText().replace(".", "").replace("-", ""));
        //pessoa.setiRg(Integer.parseInt(txtRG.getText().replace(".", "")));
        pessoa.setiRg((int) Float.parseFloat(numero));
        pessoa.setStrTelefone(txtDDD.getText() + txtTelefone.getText().replace("-", ""));
        pessoa.setStrNome(txtNome.getText());
        pessoa.setStrEmail(txtEmail.getText());
        pessoa.setStrProfissao(txtProfisao.getText());

        if (cbxGenero.getSelectedItem().toString().equals("Masculino")) {
            pessoa.setStrGenero("M");
        } else if (cbxGenero.getSelectedItem().toString().equals("Feminino")) {
            pessoa.setStrGenero("F");
        } else {
            throw new clExceptions("Por favor, escolha um sexo");
        }

        return pessoa;
    }

    public clPessoa limparCampos() {
        clPessoa pessoa = new clPessoa();

        txtCodigo.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtRG.setText("");
        txtTelefone.setText("");
        txtDDD.setText("");
        txtProfisao.setText("");
        txtEmail.setText("");
        cbxGenero.setSelectedIndex(0);

        return pessoa;
    }

    /**
     * Creates new form CadastroPessoa
     */
    public CadastroPessoa(int iCodUsuario) {
        initComponents();
        cadastrar.addActionListener(botoes);
        cancelar.addActionListener(botoes);
        excluir.addActionListener(botoes);
        limpar.addActionListener(botoes);
        jbtnPesquisar.addActionListener(botoes);
        this.iCodUsuario = iCodUsuario;
    }

    public clPessoa apagarPessoa(clPessoa pessoa) {
        // pessoa.apagarPessoa();
        limparCampos();

        return null;
    }

    public int getCodPessoa() throws clExceptions {
        int cod;
        try {
            cod = Integer.parseInt(txtCodigo.getText());
            return cod;
        } catch (NumberFormatException ex) {
            throw new clExceptions("Valor de Código invalido");
        }
    }

    public void setPessoa(clPessoa pessoa) throws clExceptions  {
        if (pessoa != null) {
            txtCodigo.setText(Integer.toString(pessoa.getiCodPessoa()));
            txtNome.setText(pessoa.getStrNome());
            txtCpf.setText(pessoa.getStrCpf());
            txtRG.setText(Integer.toString(pessoa.getiRg()));
            txtTelefone.setText(pessoa.getStrTelefone().substring(2, pessoa.getStrTelefone().length()));
            txtDDD.setText(pessoa.getStrTelefone().substring(0, 2));
            txtProfisao.setText(pessoa.getStrProfissao());
            txtEmail.setText(pessoa.getStrEmail());

            switch (pessoa.getStrGenero()) {
                case "M":
                    cbxGenero.setSelectedIndex(1);
                    break;
                case "F":
                    cbxGenero.setSelectedIndex(1);
                    break;
                default:
                    cbxGenero.setSelectedIndex(0);
                    break;
            }
        }else
        {
            limparCampos();
            throw new clExceptions("Pessoa não encontrada");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1Nome9 = new javax.swing.JLabel();
        jLabel1Nome10 = new javax.swing.JLabel();
        jLabel1Nome11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtProfisao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        cancelar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtDDD = new javax.swing.JFormattedTextField();
        jbtnPesquisar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Pessoa");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preencha todos compos abaixo:", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel1Nome9.setText("Nome:");

        jLabel1Nome10.setText("CPF:");

        jLabel1Nome11.setText("RG:");

        jLabel16.setText("Telefone:");

        cadastrar.setText("Salvar");
        /*
        */

        excluir.setText("Excluir");
        excluir.setActionCommand("excluir");
        /*
        */

        //excluir.addActionListener(listener);

        jLabel1.setText("codigo:");

        jLabel17.setText("Profisão:");

        jLabel18.setText("E-mail:");

        jLabel19.setText("Genero:");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Masculino", "Femenino" }));

        cancelar.setText("Cancelar");
        /*
        */

        limpar.setText("Limpar");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("(");

        jLabel3.setText(")");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jbtnPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1Nome10)
                                .addComponent(jLabel1Nome9)
                                .addComponent(jLabel1Nome11)
                                .addComponent(jLabel1)))
                        .addComponent(jLabel16))
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnPesquisar))
                        .addComponent(txtNome)
                        .addComponent(txtProfisao)
                        .addComponent(txtEmail)
                        .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(3, 3, 3)
                            .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefone)))
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpar)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnPesquisar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Nome9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Nome10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Nome11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProfisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(excluir)
                    .addComponent(cancelar)
                    .addComponent(limpar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cadastrar.setActionCommand("cadastrar");
        cadastrar.addActionListener(listener);
        excluir.setActionCommand("excluir");
        excluir.addActionListener(listener);
        cancelar.setActionCommand("cancelar");
        cancelar.addActionListener(listener);
        limpar.setActionCommand("limpar");
        limpar.addActionListener(listener);
        jbtnPesquisar.setActionCommand("pesquisar");
        jbtnPesquisar.addActionListener(listener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.getAccessibleContext().setAccessibleName("Preencha todos os compos abaixo:");
        jPanel4.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void verificaDados() throws clExceptions {

        try {
            Integer.parseInt(txtCodigo.getText());
        } catch (NumberFormatException ex) {
            throw new clExceptions("Por favor, preencha o campo de Código Corretamente");
        }

        try {
            String numero1 = txtCpf.getText().replace(".", "").replace("-", "");
            Double.parseDouble(numero1);
        } catch (NumberFormatException ex) {
            throw new clExceptions("Por favor, preencha o campo de CPF corretamente");
        }

        try {
            String numero = txtRG.getText().replace(".", "");
            Integer.parseInt(numero);
        } catch (NumberFormatException ex) {
            throw new clExceptions("Por favor, preencha o campo de RG corretamente");
        }

        if (txtNome.getText().equals("")) {
            throw new clExceptions("Por favor, preencha o campo de Nome corretamente");
        }

        if (txtProfisao.getText().equals("")) {
            throw new clExceptions("Por favor, preencha o campo de profisão corretamente");
        }

        try {
            String numero1 = txtTelefone.getText().replace("-", "");
            Double.parseDouble(numero1);
            Integer.parseInt(txtDDD.getText());
        } catch (NumberFormatException ex) {
            throw new clExceptions("Por favor, preencha o campo de telefone corretamente erro: ");
        }
        if (txtEmail.getText().equals("")) {
            throw new clExceptions("Por favor, preencha o campo de e-mail corretamente");
        }

        if (cbxGenero.getSelectedItem().toString().equals("Selecionar")) {
            throw new clExceptions("Por favor, escolha um sexo");
        }

        //email não é obrigatório
        /* if (txtEmail.getText().equals("")) {
            throw new clExceptions("Por favor, preencha o campo de Email corretamente");
        }*/
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1Nome10;
    private javax.swing.JLabel jLabel1Nome11;
    private javax.swing.JLabel jLabel1Nome9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtnPesquisar;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDDD;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProfisao;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
