import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World!");

        System.out.print("Digite o nome do autor: ");
        String x = sc.next();
        System.out.printf("Seu nome é %s%n", x);

        sc.close();
    }
}