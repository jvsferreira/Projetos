package voo;

import java.util.Scanner;

public class AirlineReservationSystem {
	//array para armazenar os assentos
    private static boolean[] seats = new boolean[10];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            // menu
            System.out.println("1. Reserve o assento");
            System.out.println("2. Visualizar todos os assentos");
            System.out.println("3. Sair");
            int choice = input.nextInt();
            if (choice == 1) {
                reserveSeat();
            } else if (choice == 2) {
                viewSeats();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Escolha inválida. Porfavor tente novamente.");
            }
        }
        input.close();
    }

    private static void reserveSeat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o número do assento: ");
        int seatNum = input.nextInt();
        if (seats[seatNum - 1] == false) {
            seats[seatNum - 1] = true;
            System.out.println("Assento reservado. Obrigado.");
        } else {
            System.out.println("Desculpe, esse assento já está reservado.");
        }
    }

    private static void viewSeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Seat " + (i + 1) + ": ");
            if (seats[i] == true) {
                System.out.println("Reservado");
            } else {
                System.out.println("Disponível");
            }
        }
    }
}