package Exercicio_05;


/* 5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.
Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?  
 */
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean[] lampadas = {false, false, false}; // Todas as lâmpadas inicialmente desligadas

        // Ligar o Interruptor 1
        lampadas[0] = true;
        System.out.println("Ligando o Interruptor 1...");
        esperar(5000); // Simula o tempo de espera de 5 seg

        // Desligar o Interruptor 1 e ligar o Interruptor 2
        lampadas[0] = false;
        lampadas[1] = true;
        System.out.println("Desligando o Interruptor 1 e ligando o Interruptor 2...");

        // Simular a ida até a sala das lâmpadas
        System.out.println("Indo até a sala das lâmpadas...");
        verificarLampadas(lampadas);
    }

    //Tempo de espera
    private static void esperar(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


    private static void verificarLampadas(boolean[] lampadas) {
        System.out.println("Verificando lâmpadas...");

        if (lampadas[1]) {
            System.out.println("A lâmpada 2 está acesa.");
        } else {
            System.out.println("A lâmpada 2 está apagada.");
        }


        System.out.println("A lâmpada 1 estava quente antes de vir até aqui.");

        System.out.println("A lâmpada 3 está apagada e fria.");
    }
}

