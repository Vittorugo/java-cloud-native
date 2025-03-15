package org.example;

import org.example.exceptions.ParametrosInvalidosException;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro valor:");
        int primeiroValor = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o segundo valor:");
        int segundoValor = scanner.nextInt();

        try {
            contar(primeiroValor, segundoValor);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException{
        if(segundoValor < primeiroValor)
            throw new ParametrosInvalidosException("O segundo valor deve ser maior que o primeiro!!!");


        int contagem = segundoValor - primeiroValor;

        for(int i = 1; i <= contagem; i++)
            System.out.println("Imprimindo o número " + i);

    }
}