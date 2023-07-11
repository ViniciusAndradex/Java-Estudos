import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> listEmployees = new ArrayList<>();

        System.out.println("How many employees do you want to register?");
        int count = sc.nextInt();
        char typeEmployee;

        for (int c = 1; c <= count; c++){
            System.out.println("----------------------------------------------------");
            do{
                System.out.println("[y/n] Outsourced?");
                typeEmployee = sc.next().charAt(0);
            } while (typeEmployee != 'y' && typeEmployee != 'n');

            System.out.printf("Employee #%d:%n", c);
            sc.nextLine();
            System.out.print("Employee name: ");
            String name = sc.nextLine();
            System.out.print("Worked hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Amount paid per hour: ");
            Double valuePerHour = sc.nextDouble();
            if (typeEmployee == 'y') {
                System.out.print("What is the amount of the additional charge: ");
                double addCharge = sc.nextDouble();
                listEmployees.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));

            } else {
                listEmployees.add(new Employee(name, hours, valuePerHour));
            }

        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee x: listEmployees) {
            System.out.printf("%s - $%.2f%n", x.getName(),x.payment());
        }

        sc.close();

    }
}
