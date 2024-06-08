package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder2[] products = new ProductOrder2[2];

        ProductOrder2 p1 = createOrder("pencile", 1000, 3);
        products[0] = p1;

        ProductOrder2 p2 = createOrder("apple", 1500, 5);
        products[1] = p2;

        printOrder(products);

        System.out.println("total amount : " + getTotalAmount(products));
    }

    static ProductOrder2 createOrder(String productName, int price, int quantity) {
        ProductOrder2 productOrder2 = new ProductOrder2();
        productOrder2.productName = productName;
        productOrder2.price = price;
        productOrder2.quantity = quantity;

        return productOrder2;
    }

    static void printOrder(ProductOrder2[] orders) {
        for (ProductOrder2 order : orders) {
            System.out.println("name : " + order.productName + ", price : " + order.price
                    + ", quantity : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder2[] orders) {
        int totalPrice = 0;
        for (ProductOrder2 order : orders) {
            totalPrice += order.price;
        }
        return totalPrice;
    }
}
