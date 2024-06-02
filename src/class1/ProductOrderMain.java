package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] products = new ProductOrder[2];

        ProductOrder p1 = new ProductOrder();
        p1.Price = 1000;
        p1.productName = "pencile";
        p1.quantity = 3;
        products[0] = p1;

        ProductOrder p2 = new ProductOrder();
        p2.Price = 1500;
        p2.productName = "apple";
        p2.quantity = 5;
        products[1] = p2;

        for (ProductOrder p : products){
            System.out.println(p.Price + " " + p.quantity + " " + p.productName);
        }

    }
}
