package Trabalho;

public class FibbonacciIterativo {

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

        int n, v1 = 0, res = 0, i, v2 = 1;

        System.out.println("CÓDIGO ITERATIVO");
        n = 0;
        repetir = 0;

        System.out.println("Informe um valor: ");

        i = 45;
        n = i;

        if (n
                == 0) {
            System.out.println("O Fibonacci de " + n + " é: 0");
        } else {
            while (i >= 0) {
                repetir++;
                res = v1 + v2;
                v2 = v1;
                v1 = res;
                i = i - 1;
            }
            System.out.println("O Fibonacci de " + n + " é: " + res);
            System.out.println("");
            System.out.println("O sistema percorreu a função " + repetir + " vezes.");

        }

        long tempoFinal = System.currentTimeMillis();

        System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

    }

}
