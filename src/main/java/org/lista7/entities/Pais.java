package org.lista7.entities;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private double populacao;
    private double dimensaoKm2;
    private List<Pais> fronteiras;

    public Pais(String codigoISO, String nome, double populacao, double dimensaoKm2, List<Pais> fronteiras) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensaoKm2 = dimensaoKm2;
        this.fronteiras = new ArrayList<>();
    }

    public Pais(String bra, String brasil, double populacao) {
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensaoKm2() {
        return dimensaoKm2;
    }

    public void setDimensaoKm2(double dimensaoKm2) {
        this.dimensaoKm2 = dimensaoKm2;
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(List<Pais> fronteiras) {
        this.fronteiras = fronteiras;
    }

    public void adicionarFronteira(Pais pais){
        if (!fronteiras.contains(pais)){
            fronteiras.add(pais);
            pais.fronteiras.add(this);
        }
    }

    public boolean paisVizinho (Pais outroPais){
        return fronteiras.contains(outroPais);
    }

    public double densidadePopulacional(){
        if (populacao == 0 || dimensaoKm2 == 0){
            return 0.0;
        }
        return populacao/dimensaoKm2;
    }

    public List<Pais> vizinhosComuns (Pais outroPais){
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais vizinho : fronteiras){
            if (outroPais.paisVizinho(vizinho)){
                vizinhosComuns.add(vizinho);
            }
        }
        return vizinhosComuns;
    }
}
