package Exercicio_04;

/* 4) Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2,10, 12, 16, 17, 18, 19, ____ */

public class Exercicio_04 {
    public static void main(String[] args) {
        // Sequência A)
        int[] sequenciaA = {1, 3, 5, 7};
        int proximoA = sequenciaA[sequenciaA.length - 1] + 2;  // A lógica é + 2
        System.out.println("Próximo elemento da sequência a): " + proximoA);

        // Sequência B)
        int[] sequenciaB = {2, 4, 8, 16, 32, 64};
        int proximoB = sequenciaB[sequenciaB.length - 1] * 2;  // A lógica é *2
        System.out.println("Próximo elemento da sequência b): " + proximoB);

        // Sequência C)
        int[] sequenciaC = {0, 1, 4, 9, 16, 25, 36};
        int proximoC = (int) Math.pow(sequenciaC.length, 2);  // A lógica é quadrado dos numeros inteiros consecutivos
        System.out.println("Próximo elemento da sequência c): " + proximoC);

        // Sequência D)
        int[] sequenciaD = {4, 16, 36, 64};
        int proximoD = (int) Math.pow((sequenciaD.length + 1) * 2, 2);  // A lógica é quadrado dos numeros pares {2, 4, 6 , 8}
        System.out.println("Próximo elemento da sequência d): " + proximoD);

        // Sequência E)
        int[] sequenciaE = {1, 1, 2, 3, 5, 8};
        int proximoE = sequenciaE[sequenciaE.length - 1] + sequenciaE[sequenciaE.length - 2];  // Fibonacci
        System.out.println("Próximo elemento da sequência e): " + proximoE);

        // Sequência F)
        int[] sequenciaF = {2, 10, 12, 16, 17, 18, 19};
        int proximoF = sequenciaF[sequenciaF.length - 1] + 1;  // A lógica é sequência crescente sem múltiplos de 11
        System.out.println("Próximo elemento da sequência f): " + proximoF);
    }
}

