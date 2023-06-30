package condicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        switch (x) {
            case 1 -> System.out.println(x + " Teste 1");
            case 2 -> System.out.println(x + " Teste 2");
            case 3 -> System.out.println(x + " Teste 3");
            default -> System.out.println(x + " Qualquer");
        };

        System.out.printf("É isso x passou por case %d%n", x);

    }
}
