package loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float fim = sc.nextInt();

        for (int inicio = 0; inicio <= fim; inicio++) {
            System.out.printf("Somando: %d + %.2f = %.2f%n", inicio, (float) inicio, Float.sum(inicio, fim));
        }

        sc.close();
    }
}
