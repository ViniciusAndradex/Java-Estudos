package entities;

public class Product {
    /*
        Encapsulamento.
     */
    private String name;
    private double price;
    private int quantity;
    public static final float PI = 3.14f;

    /*
        Construtor.
    */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /*
        Métodos de acesso a dados encapsulados
    * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }


    public double totalValueInStock(){
        return quantity * price;
    }

    public void addProducts(int quantity){
        this.quantity  += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public static double avgProductsPrices(Product[] vect) {
        double sum = 0f;
        for (int ini = 0; ini < vect.length; ini++) {
            sum += vect[ini].getPrice();
        }
        return sum / vect.length;
    }

    /*
        Método de sobreposição para apresentação de objeto.
    */
    @Override
    public String toString() {
        return "data: " + name +
                ", $ " + String.format("%.2f", price) +
                ", " + quantity +
                " units, Total: $ " + ", $ " + String.format("%.2f", totalValueInStock());
    }

    public static void showResult(){
        System.out.printf("PI: " + PI + "%n");
    }

}
