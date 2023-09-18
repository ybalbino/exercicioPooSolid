package org.lista8.aplicacion;

import org.lista8.entities.Candidato;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorVestibular {
    public static void main(String[] args) {
        ArrayList<Candidato> candidatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar candidato");
            System.out.println("2. Exibir todos os candidatos");
            System.out.println("3. Excluir candidato por matrícula");
            System.out.println("4. Sair");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite a matrícula do candidato:");
                    int matricula = sc.nextInt();
                    System.out.println("Digite a nota do candidato:");
                    double nota = sc.nextDouble();
                    candidatos.add(new Candidato(matricula, nota));
                    System.out.println("Candidato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de candidatos:");
                    for (Candidato candidato : candidatos) {
                        System.out.println(candidato);
                    }
                    break;

                case 3:
                    System.out.println("Digite a matrícula do candidato a ser excluído:");
                    int matriculaExcluir = sc.nextInt();
                    boolean candidatoEncontrado = false;

                    for (Candidato candidato : candidatos) {
                        if (candidato.getMatricula() == matriculaExcluir) {
                            candidatos.remove(candidato);
                            System.out.println("Candidato removido com sucesso!");
                            candidatoEncontrado = true;
                            break;
                        }
                    }

                    if (!candidatoEncontrado) {
                        System.out.println("Candidato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
            }
        }

    }
