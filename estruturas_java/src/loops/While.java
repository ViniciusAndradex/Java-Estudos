package loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        boolean x = false;
        int b = 1;
        Scanner sc = new Scanner(System.in);

        while (!x){
            System.out.println(b);
            b++;
            if (b > 5) {
                x = true;
            }
        }

        do {
            b = sc.nextInt();
        } while (b > 2);

        sc.close();
    }
}
