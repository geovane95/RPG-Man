package br.org.rpgman.rpgman.domain.entidades;

public class TipoDeDano {
    private String nome;
    private int acrecimoForca;
    private Elemento elemental;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAcrecimoForca() {
        return acrecimoForca;
    }

    public void setAcrecimoForca(int acrecimoForca) {
        this.acrecimoForca = acrecimoForca;
    }

    public Elemento getElemental() {
        return elemental;
    }

    public void setElemental(Elemento elemental) {
        this.elemental = elemental;
    }
}
