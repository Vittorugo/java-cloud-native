package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua Conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da sua Agência:");
        String agencia = scanner.next();

        scanner.nextLine(); // Consumir quebra de linha

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo da sua conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado " +
                "por criar uma conta no nosso banco," +
                "sua agência é "+ agencia + "," +
                "conta " + numero + " e " +
                "seu saldo " + saldo + " já está disponível");
    }
}