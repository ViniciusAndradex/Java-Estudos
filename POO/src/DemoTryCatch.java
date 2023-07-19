import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {
        method1();
        System.out.println("EndProgram");
    }
    public static void method1() {
        System.out.println("1");
        method2();
        System.out.println("2");
    }
    public static void method2() {
        System.out.println("Start");
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");
        try {
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        } catch (InputMismatchException ie) {
            System.out.println(ie.getClass());
            ie.printStackTrace();
        }
        sc.close();
        System.out.println("End");
    }

}
