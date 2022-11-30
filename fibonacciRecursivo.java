package Trabalho;

import java.util.Scanner;

public class FibonnacciRecursivo {

    static int repetir = 0;

    public static long fibonacci(int n) {
        repetir++;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        
        long tempoInicial = System.currentTimeMillis();

        int n;

        System.out.println("CÓDIGO RECURSIVO");

        n = 43;

        System.out.printf("Fibonacci de " + n + " é: " + fibonacci(n + 1));
        System.out.println("");
        System.out.println("O sistema percorreu a função " + repetir + " vezes.");

        System.out.println("");
        System.out.println("");

        long tempoFinal = System.currentTimeMillis();

        System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

    }
}
