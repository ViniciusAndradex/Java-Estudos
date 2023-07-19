import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");
        try {
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
        } catch (InputMismatchException ie) {
            System.out.println(ie.getClass());
        }

        System.out.println("sss");

        sc.close();
    }
}
