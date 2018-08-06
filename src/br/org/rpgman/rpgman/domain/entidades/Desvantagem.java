package br.org.rpgman.rpgman.domain.entidades;

public class Desvantagem extends EntidadeDominio{
    private String nome;
    private int custo;
    private String descricao;
    private CategoriaDesvantagem categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaDesvantagem getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDesvantagem categoria) {
        this.categoria = categoria;
    }
}
