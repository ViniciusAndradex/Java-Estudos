import entities_.enums.WorkerLevel;
import entitites_.Department;
import entitites_.HourContract;
import entitites_.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        System.out.println("Enter Worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");

        Double salary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int qtd = sc.nextInt();

        for (int count = 1; count <= qtd; count++) {
            System.out.printf("Enter contract #%d data: %n", count);
            System.out.print("Date (DD/MM/YYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            Double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

            HourContract contract = new HourContract(date, value, hours);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));

        sc.close();

    }
}