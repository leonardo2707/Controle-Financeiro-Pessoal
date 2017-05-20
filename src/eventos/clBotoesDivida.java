package eventos;

import classes.clDivida;
import classes.clLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.CadastroDivida;

public class clBotoesDivida implements ActionListener {

    private clDivida divida;

    private CadastroDivida cadastroDivida;

    public clBotoesDivida(CadastroDivida cadastroDivida) {
        this.cadastroDivida = cadastroDivida;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("cadastrar".equals(e.getActionCommand())) {
            this.divida = this.cadastroDivida.getDivida();
            this.divida.salvarDivida();

            //new DividaDao().insert(divida);
        }

        if ("cancelar".equals(e.getActionCommand())) {
            new clLog("Saindo da tela de Dívida");
            this.cadastroDivida.dispose();
        }

        if ("limpar".equals(e.getActionCommand())) {
            this.divida = this.cadastroDivida.limparCampos();
             new clLog("Dívida foi limpa");
        }

        if ("excluir".equals(e.getActionCommand())) {
            if (this.divida != null) {
                this.divida = this.cadastroDivida.apagarDivida(this.divida);
            }
        }
    }

}
