package br.org.rpgman.rpgman.domain.entidades;

import br.org.rpgman.rpgman.domain.Entidade;

public class EntidadeDominio implements Entidade {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
