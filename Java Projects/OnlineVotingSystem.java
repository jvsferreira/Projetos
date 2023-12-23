package votos;

import java.util.Scanner;

public class OnlineVotingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;

        System.out.print("Porfavor digite o seu nome: ");
        String userName = input.nextLine();

        System.out.print("Porfavor entre com sua idade: ");
        int userAge = input.nextInt();

        if (userAge >= 18) {
            System.out.println("Porfavor selecione o candidato em que quer votar:");
            System.out.println("1. Candidato A");
            System.out.println("2. Candidato B");

            int userSelection = input.nextInt();

            if (userSelection == 1) {
                candidate1Votes++;
            } else if (userSelection == 2) {
                candidate2Votes++;
            }

            System.out.println("Obrigado por votar, " + userName + "!");
        } else {
            System.out.println("Desculpe, mas você não é elegível para votar.");
        }

        System.out.println("Candidato 1: " + candidate1Votes + " votos");
        System.out.println("Candidato 2: " + candidate2Votes + " votos");
    }
}
