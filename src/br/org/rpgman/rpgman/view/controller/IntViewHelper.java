package br.org.rpgman.rpgman.view.controller;

import br.org.rpgman.rpgman.core.aplicacao.Resultado;
import br.org.rpgman.rpgman.domain.entidades.EntidadeDominio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IntViewHelper {
    EntidadeDominio getEntidade(HttpServletRequest request);
    void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response);
}
