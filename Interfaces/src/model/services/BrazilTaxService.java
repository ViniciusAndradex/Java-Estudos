package model.services;

public class BrazilTaxService {

    public double tax(double amount) {
        return (amount > 100) ? amount * 0.15: amount * 0.2;
    }

}
