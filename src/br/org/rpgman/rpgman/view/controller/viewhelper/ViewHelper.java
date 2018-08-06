package br.org.rpgman.rpgman.view.controller.viewhelper;

import br.org.rpgman.rpgman.view.controller.IntViewHelper;

public abstract class ViewHelper implements IntViewHelper {
    private String lista;
    private String view;
    private String edit;
    public ViewHelper(String lista, String view, String edit){
        lista = this.lista;
        view = this.view;
        edit = this.edit;
    }
}
