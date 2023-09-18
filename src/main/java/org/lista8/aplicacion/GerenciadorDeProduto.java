package org.lista8.aplicacion;

import org.lista8.entities.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeProduto {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\nOpções: ");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Exibir todos os produtos");
            System.out.println("3 - Excluir produto por nome");
            System.out.println("4 - Sair do programa");
            System.out.println("Escolha a opção: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    Produto novoProduto = new Produto(nome, preco);
                    listaDeProdutos.add(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("lista de Produtos: ");
                    for (Produto produto : listaDeProdutos){
                        System.out.println("Nome: " + produto.getNome()+ ", Preço: " + produto.getPreco());
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do produto a ser excluida: ");
                    String nomeParaExcluir = sc.nextLine();
                    boolean removido = false;
                    for (Produto produto : listaDeProdutos){
                        if (produto.getNome().equalsIgnoreCase(nomeParaExcluir)){
                            listaDeProdutos.remove(produto);
                            removido = true;
                            break;
                        }
                    }
                    if (removido){
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção invalida, tente novamente.");
                    break;
            }
        }
    }
}
