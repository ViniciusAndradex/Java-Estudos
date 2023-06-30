package condicionais;

import java.awt.*;
import java.util.Locale;

public class Ternario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println((33 < 333) ? "Jorge": "Maira");

        if (33 > 55) {
            double discount = 55.99; //Discount não iniciada fora do escopo do if. Não compila;
        }
        double discount = 55.8;
        System.out.println(discount);
    }
}
