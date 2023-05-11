package bankAccount;

public class Product{
    private double productCost;
    private int qtyOfProduct;
    private String productName;

    //takes all 3 as parameters
    public Product(double cost, int qty, String name) {
            this.productCost = cost;
            this.qtyOfProduct = qty;
            this.productName = name;
    }

    //total cost method
    public void totalCost() {
        double total = this.productCost * this.qtyOfProduct;
        System.out.println("The total cost is $" + total);
    }

    //print product method
    public void printProduct() {
        System.out.println("Product name: " + this.productName + " \n " +
                "Cost: $" + this.productCost + " \n " +
                "Quantity purchased: " + this.qtyOfProduct);
    }

}

class Purchase {
    public static void main(String[] args) {
        Product gossip = new Product(20, 100, "Lady Whistledown's Society Papers");

        gossip.printProduct();
        gossip.totalCost();

    }
}