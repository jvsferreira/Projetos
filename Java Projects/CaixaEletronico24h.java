package simuladorDeCaixaEletronico;

import java.util.Scanner;

public class ATM {
    public static void main(String args[]) {
        // Declare e inicie saldo, depoisto
        int balance = 5000, withdraw, deposit;
        try (// crie uma classe para escanear o objeto escolhido pelo usuario
		Scanner sc = new Scanner(System.in)) {
			while (true) {
			    System.out.println("**Caixa Eletrônico 24 horas**");
			    System.out.println("1. Saque");
			    System.out.println("2. Deposito");
			    System.out.println("3. Saldo");
			    System.out.println("4. SAIR");
			    System.out.print("Escolha a operação:");

			    // escolha do usuário
			    int choice = sc.nextInt();
			    switch (choice) {
			        case 1:
			            System.out.print("Digite o valor do saque:");

			            // obter o dinheiro retirado do usuário
			            withdraw = sc.nextInt();

			            // verifique se o saldo é maior ou igual ao valor do saque
			            if (balance >= withdraw) {
			                // remover o valor da retirada do saldo total
			                balance = balance - withdraw;
			                System.out.println("Por favor retire as cédulas");
			            } else {
			                // Mostre uma mensagem de erro
			                System.out.println("Saldo insuficiente!");
			            }
			            System.out.println("");
			            break;

			        case 2:

			            System.out.print("Digite o valor a ser depositado:");

			            // obter o valor do depósito do usuário
			            deposit = sc.nextInt();

			            // adicione o valor do depósito ao saldo total
			            balance = balance + deposit;
			            System.out.println("Valor depositado com sucesso!");
			            System.out.println("");
			            break;

			        case 3:
			            // Mostre o saldo total ao usuário
			            System.out.println("Saldo: " + balance);
			            System.out.println("");
			            break;

			        case 4:
			            // Sair do Menu
			            System.exit(0);
			        default:
			            //default statement
			            System.out.println("Valor inválido!");
			    }
			}
		}
    }
}
