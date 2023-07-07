import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class MainEstoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product.showResult();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        Product x1 = new Product(name, price, quantity);

        name = sc.next();

        x1.setName(name);

        System.out.println("New name: " + x1.getName());

        System.out.printf("Product " + x1 + "%n");


        boolean resp;
        int opc;
        String s;
        char x;

        do {

            System.out.printf("Menu:%n" +
                    "1: Add products;%n" +
                    "2: Remove Products.%n");
            opc = sc.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Enter the number of products to be added in stock: ");
                    x1.addProducts(sc.nextInt());
                }
                case 2 -> {
                    System.out.println("Enter the number of products to be removed from stock: ");
                    x1.removeProducts(sc.nextInt());
                }
            }

            System.out.printf("Updated " + x1 + "%n");

            System.out.println("Do you want the operation of any of a doing?");
            s = sc.next().toLowerCase().trim();
            x = s.charAt(0);
            resp = x == 'y';
        } while(resp);

        sc.close();

    }
}
