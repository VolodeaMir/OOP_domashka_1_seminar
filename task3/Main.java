package task3;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Монитор", 200.0, 4);
        Product product2 = new Product("Клавиатура", 50.0, 5);
        Product product3 = new Product("Мышь", 20.0, 3);

        Product[] purchasedProducts = { product1, product2, product3 };

        Basket basket = new Basket(purchasedProducts);

        System.out.println("Купленные товары в корзине: ");
        for (Product product : basket.getProducts()) {
            System.out.println(" - " + product.getName());
        }
    }
}
