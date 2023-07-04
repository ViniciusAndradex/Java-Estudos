package array;

import java.util.Locale;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int tam = sc.nextInt();

        double[] height = new double[tam];

        for (int ini = 0; ini  < tam; ini++) {
            System.out.print("Digite sua altura: ");
            height[ini] = sc.nextDouble();
        }

        System.out.printf("Average height: %.2f%n", avgHeight(height));

    }

    public static double avgHeight(double[] height) {
        double sum = 0f;
        for (int ini = 0; ini < height.length; ini ++) {
                sum += height[ini];
        }
        return sum / height.length;
    }

}
