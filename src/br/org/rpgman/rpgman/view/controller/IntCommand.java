package br.org.rpgman.rpgman.view.controller;

import br.org.rpgman.rpgman.core.aplicacao.Resultado;
import br.org.rpgman.rpgman.domain.entidades.EntidadeDominio;

public interface IntCommand {
    Resultado executar(EntidadeDominio entidadeDominio);
}
