package br.org.rpgman.rpgman.core.aplicacao;

import br.org.rpgman.rpgman.domain.entidades.EntidadeDominio;

import java.util.List;

public class Resultado {
    private boolean status;
    private List<EntidadeDominio> entidadeDominios;
    private String msg;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<EntidadeDominio> getEntidadeDominios() {
        return entidadeDominios;
    }

    public void setEntidadeDominios(List<EntidadeDominio> entidadeDominios) {
        this.entidadeDominios = entidadeDominios;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
