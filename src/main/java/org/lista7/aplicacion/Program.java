package org.lista7.aplicacion;

import org.lista7.entities.Pais;

public class Program {
    public static void main(String[] args) {

        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        Pais uruguai = new Pais("URY", "Uruguai", 176215);


        brasil.adicionarFronteira(argentina);
        brasil.adicionarFronteira(uruguai);
        argentina.adicionarFronteira(uruguai);


        brasil.setPopulacao(211049527);
        argentina.setPopulacao(45195777);
        uruguai.setPopulacao(3473727);


        System.out.println("Brasil é vizinho da Argentina? " + brasil.paisVizinho(argentina));
        System.out.println("Argentina é vizinha do Uruguai? " + argentina.paisVizinho(uruguai));


        System.out.println("Densidade populacional do Brasil: " + brasil.densidadePopulacional() + " hab/km²");
        System.out.println("Densidade populacional da Argentina: " + argentina.densidadePopulacional()+ " hab/km²");
        System.out.println("Densidade populacional do Uruguai: " + uruguai.densidadePopulacional() + " hab/km²");


        System.out.println("Vizinhos comuns entre Brasil e Argentina: ");
        for (Pais vizinho : brasil.vizinhosComuns(argentina)) {
            System.out.println(vizinho.getNome());
        }
    }

}
