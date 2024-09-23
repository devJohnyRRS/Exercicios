package Exercicio_01;

/*1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; */

public class Exercicio_01 {

    public static void main(String[] args) {

        int numero = 11; //Entre com o valor aqui


        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }


    public static boolean isFibonacci(int numero) {
        int a = 0, b = 1, soma = 0;


        while (soma < numero) {
            soma = a + b;
            a = b;
            b = soma;
        }


        return (soma == numero || numero == 0);
    }
}


