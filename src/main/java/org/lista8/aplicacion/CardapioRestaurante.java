package org.lista8.aplicacion;

import org.lista8.entities.Prato;

import java.util.ArrayList;
import java.util.Scanner;

public class CardapioRestaurante {
    public static void main(String[] args) {
        ArrayList<Prato> cardapio = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar prato");
            System.out.println("2 - Exibir todos os pratos");
            System.out.println("3 - Excluir prato pelo nome");
            System.out.println("4 - Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do prato: ");
                    String nomePrato = sc.next();
                    Prato novoPrato = new Prato(nomePrato);

                    System.out.println("Digite os ingredientes do prato (digite 'fim' para encerrar):");
                    while (true) {
                        String ingrediente = sc.next();
                        if (ingrediente.equals("fim")) {
                            break;
                        }
                        novoPrato.adicionarIngredientes(ingrediente);
                    }

                    cardapio.add(novoPrato);
                    System.out.println("Prato adicionado ao cardápio!");
                    break;
                case 2:
                    if (cardapio.isEmpty()) {
                        System.out.println("O cardápio está vazio.");
                    } else {
                        System.out.println("Lista de pratos no cardápio:");
                        for (Prato prato : cardapio) {
                            prato.exibirDetalhes();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do prato a ser excluído: ");
                    String nomeParaExcluir = sc.next();
                    boolean removido = false;

                    for (Prato prato : cardapio) {
                        if (prato.getNome().equalsIgnoreCase(nomeParaExcluir)) {
                            cardapio.remove(prato);
                            removido = true;
                            System.out.println("Prato removido com sucesso.");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Prato não encontrado no cardápio.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

