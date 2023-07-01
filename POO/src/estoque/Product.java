package estoque;

public class Product {
    public String name;
    public double price;
    public int quantity;
    public static final float PI = 3.14f;

    public double totalValueInStock(){
        return quantity * price;
    }

    public void addProducts(int quantity){
        this.quantity  += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

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
