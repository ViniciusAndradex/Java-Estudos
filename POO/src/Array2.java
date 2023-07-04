import estoque.Product;

import java.util.Locale;
import java.util.Scanner;


public class Array2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tam = sc.nextInt();

        Product[] vector = new Product[tam];

        for (int ini = 0; ini < tam; ini++) {
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            vector[ini] = new Product(name, price);
        }

        System.out.printf("Avg prices %.2f%n", Product.avgProductsPrices(vector));

        sc.close();
    }

}
