package br.org.rpgman.rpgman.domain.entidades;

public class Escola extends EntidadeDominio{
    private String nome;
    private Elemento elemento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }
}
