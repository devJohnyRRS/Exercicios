package Exercicio_03;


/* 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA? */

public class Exercicio_03 {
    public static void main(String[] args) {
        // Código do exemplo
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println((SOMA)); // Podemos concluir que ao final da soma o valor da variável será 77

    }
}
