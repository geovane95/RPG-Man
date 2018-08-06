package br.org.rpgman.rpgman.domain.entidades;

public class Vantagem extends EntidadeDominio{
    private String nome;
    private int custo;
    private String descricao;
    private boolean unica;
    private boolean pericia;
    private CategoriaVantagem categoria;

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

    public boolean isUnica() {
        return unica;
    }

    public void setUnica(boolean unica) {
        this.unica = unica;
    }

    public CategoriaVantagem getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVantagem categoria) {
        this.categoria = categoria;
    }

    public boolean isPericia() {
        return pericia;
    }

    public void setPericia(boolean pericia) {
        this.pericia = pericia;
    }
}
