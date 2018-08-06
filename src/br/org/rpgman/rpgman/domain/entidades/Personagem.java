package br.org.rpgman.rpgman.domain.entidades;

import java.util.List;

public class Personagem extends EntidadeDominio{
    private String nome;
    private int pontos;
    private Caracteristicas caracteristicas;
    private int pontosDeVida;
    private int pontosDeMagia;
    private int pontosDeExperiencia;
    private List<Vantagem> vantagens;
    private List<Desvantagem> desvantagens;
    private List<TipoDeDano> tiposDeDanos;
    private List<Magia> magiasConhecidas;
    private List<Item> itens;
    private String historia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public int getPontosDeMagia() {
        return pontosDeMagia;
    }

    public void setPontosDeMagia(int pontosDeMagia) {
        this.pontosDeMagia = pontosDeMagia;
    }

    public int getPontosDeExperiencia() {
        return pontosDeExperiencia;
    }

    public void setPontosDeExperiencia(int pontosDeExperiencia) {
        this.pontosDeExperiencia = pontosDeExperiencia;
    }

    public List<Vantagem> getVantagens() {
        return vantagens;
    }

    public void setVantagens(List<Vantagem> vantagens) {
        this.vantagens = vantagens;
    }

    public List<Desvantagem> getDesvantagens() {
        return desvantagens;
    }

    public void setDesvantagens(List<Desvantagem> desvantagens) {
        this.desvantagens = desvantagens;
    }

    public List<TipoDeDano> getTiposDeDanos() {
        return tiposDeDanos;
    }

    public void setTiposDeDanos(List<TipoDeDano> tiposDeDanos) {
        this.tiposDeDanos = tiposDeDanos;
    }

    public List<Magia> getMagiasConhecidas() {
        return magiasConhecidas;
    }

    public void setMagiasConhecidas(List<Magia> magiasConhecidas) {
        this.magiasConhecidas = magiasConhecidas;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
