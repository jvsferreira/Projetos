package votos;

import java.util.Scanner;

public class OnlineVotingSystem {
    public static void main(String[] args) {
    	// Cria um objeto Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);

       //Inicializa variáveis para acompanhar a contagem de votos
        int candidate1Votes = 0;
        int candidate2Votes = 0;

        // Pede o nome do usuário
        System.out.print("Porfavor digite o seu nome: ");
        String userName = input.nextLine();

        // Pede a idade do usuário
        System.out.print("Porfavor entre com sua idade: ");
        int userAge = input.nextInt();

        // Checa se o usuário tem idade o suficiente para votar
        if (userAge >= 18) {
            // Apresentar ao usuário uma lista de candidatos para votar
            System.out.println("Porfavor selecione o candidato em que quer votar:");
            System.out.println("1. Candidato A");
            System.out.println("2. Candidato B");

            // Obtenha a seleção do usuário
            int userSelection = input.nextInt();

            // Aumentar a contagem de votos para o candidato selecionado
            if (userSelection == 1) {
                candidate1Votes++;
            } else if (userSelection == 2) {
                candidate2Votes++;
            }

            // Exibir uma mensagem de confirmação ao usuário
            System.out.println("Obrigado por votar, " + userName + "!");
        } else {
            // Exibir uma mensagem ao usuário se ele não estiver qualificado para votar
            System.out.println("Desculpe, mas você não é elegível para votar.");
        }

        // Exibir a contagem final dos votos
        System.out.println("Candidato 1: " + candidate1Votes + " votos");
        System.out.println("Candidato 2: " + candidate2Votes + " votos");
    }
}