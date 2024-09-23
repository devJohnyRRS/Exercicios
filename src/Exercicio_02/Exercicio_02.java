package Exercicio_02;

import java.util.Scanner;

/* 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;*/

public class Exercicio_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma string:");
        String texto = scanner.nextLine();


        verificaEContaA(texto);
    }


    public static void verificaEContaA(String texto) {
        int contador = 0;


        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);


            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }


        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vez(es).");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }
    }
}

