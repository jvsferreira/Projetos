package simuladorDeCaixaEletronico;

import java.util.Scanner;

public class ATM {
    public static void main(String args[]) {
        int balance = 5000, withdraw, deposit;
        try (
		Scanner sc = new Scanner(System.in)) {
			while (true) {
			    System.out.println("**Caixa Eletrônico 24 horas**");
			    System.out.println("1. Saque");
			    System.out.println("2. Deposito");
			    System.out.println("3. Saldo");
			    System.out.println("4. SAIR");
			    System.out.print("Escolha a operação:");

			    int choice = sc.nextInt();
			    switch (choice) {
			        case 1:
			            System.out.print("Digite o valor do saque:");

			            withdraw = sc.nextInt();

			            if (balance >= withdraw) {
			                balance = balance - withdraw;
			                System.out.println("Por favor retire as cédulas");
			            } else {
			                System.out.println("Saldo insuficiente!");
			            }
			            System.out.println("");
			            break;

			        case 2:

			            System.out.print("Digite o valor a ser depositado:");

			            deposit = sc.nextInt();

			            balance = balance + deposit;
			            System.out.println("Valor depositado com sucesso!");
			            System.out.println("");
			            break;

			        case 3:
			            System.out.println("Saldo: " + balance);
			            System.out.println("");
			            break;

			        case 4:
			            System.exit(0);
			        default:
			            System.out.println("Valor inválido!");
			    }
			}
		}
    }
}
