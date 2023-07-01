import triangulo.Triangle;

import java.util.Locale;

public class MainTriangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        x.a = 5.5;
        x.b = 6.6;
        x.c = 7.6;
        y.a = 5.7;
        y.b = 6.8;
        y.c = 7.9;

        System.out.printf("area x: %.2f%n", x.area());
        System.out.printf("area y: %.2f%n", y.area());
    }
}
