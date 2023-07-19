import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DemoAbstract {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int shapes = sc.nextInt();

        for (int count = 1; count <= shapes; count++) {
            System.out.printf("Shape #%d data:%n", count);
            System.out.println("Rectangle or Circle (r/c)?");
            char shape = sc.next().charAt(0);
            System.out.print("Color (BLACK, BLUE, RED): ");
            Color color =  Color.valueOf(sc.next());
            if (shape == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                shapeList.add(new Rectangle(color, width, height));
            } else if (shape == 'c') {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS:");

        for (Shape x: shapeList) {
            System.out.printf("%.2f%n", x.area());
        }

        sc.close();
    }
}
