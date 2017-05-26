package cfp.eventos;

import cfp.views.CadastroDivida;
import cfp.views.CadastroPessoa;
import cfp.views.CadastroRenda;
import cfp.views.Sobre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import cfp.views.TelaPrincipal;

public class clBotoesTelaPrincipal implements ActionListener {

   private TelaPrincipal telaPrincipal;
   private CadastroPessoa pessoa;
   private CadastroRenda renda;
   private Sobre sobre;
   private CadastroDivida divida;
    
    public clBotoesTelaPrincipal(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("cadastro_pessoa".equals(e.getActionCommand())) {
            if (pessoa != null) {
                if (!pessoa.isVisible()) {
                    pessoa = telaPrincipal.abrirJanelaCadastroPessoa();
                }
            }else
            {
                pessoa = telaPrincipal.abrirJanelaCadastroPessoa();
            }

        }

        if ("cadastro_renda".equals(e.getActionCommand())) {
            if(renda != null)
            {
                if(!renda.isVisible())
                {
                     renda = telaPrincipal.abrirJanelaRenda();
                }
                
            }else
            {
                renda = telaPrincipal.abrirJanelaRenda();
            }
        }

        if ("cadastro_dividas".equals(e.getActionCommand())) {
            if(divida != null)
            {
                if(!divida.isVisible())
                {
                    divida = telaPrincipal.abrirJanelaCadastroDivida();
                }
            }else
            {
                divida = telaPrincipal.abrirJanelaCadastroDivida();
            }
            
            
        }

        if ("sobre".equals(e.getActionCommand())) {
            if(sobre != null)
            {
                if(!sobre.isVisible())
                {
                    sobre =  telaPrincipal.abrirJanelaSobre();
                }
                
            }else
            {
               sobre =  telaPrincipal.abrirJanelaSobre();
            }
            
        }
    }







}
