package org.example;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Reprodutor Musical:");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println();
        System.out.println("Aparelho Telefonico:");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();
        System.out.println("Navegador de Internet:");
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.novaAba();
    }
}