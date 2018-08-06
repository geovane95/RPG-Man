package br.org.rpgman.rpgman.view.controller.command;

import br.org.rpgman.rpgman.core.IntFachada;
import br.org.rpgman.rpgman.core.controller.Fachada;
import br.org.rpgman.rpgman.view.controller.IntCommand;

public abstract class Command implements IntCommand{
    IntFachada fachada = new Fachada();
}
