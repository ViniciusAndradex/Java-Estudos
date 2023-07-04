package loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float fim = sc.nextInt();

        for (int inicio = 0; inicio <= fim; inicio++) {
            System.out.printf("Somando: %d + %.2f = %.2f%n", inicio, fim, sum(inicio, fim));
        }

        String[] collection = new String[] {"Mario", "Maria"};

        for (String x: collection) {
            System.out.println(x);
        }

        sc.close();
    }

    public static float sum(int x, float w){
        return  (float) x + w;
    }

}
