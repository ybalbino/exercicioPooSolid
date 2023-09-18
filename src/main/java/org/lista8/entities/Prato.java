package org.lista8.entities;

import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<String> ingredientes;

    public Prato(String nome, ArrayList<String> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public Prato(String nomePrato) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void adicionarIngredientes(String ingredientes) {
        this.ingredientes.add(ingredientes);
    }

    public void exibirDetalhes() {
        System.out.println("Nome do prato: " + nome);
        System.out.println("Ingredientes:");
        for (String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }
    }
}