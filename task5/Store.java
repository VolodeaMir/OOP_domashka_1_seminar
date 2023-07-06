package task5;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public static void main(String[] args) {

        Store store = new Store();

        store.addProduct(new Product("Монитор", 200.0, 4));
        store.addProduct(new Product("Клавиатура", 50.0, 5));
        store.addProduct(new Product("Мышь", 20.0, 3));

        List<Product> allProducts = store.getAllProducts();
        System.out.println("Каталог продуктов в магазине:");
        for (Product product : allProducts) {
            System.out.println("Название: " + product.getName());
            System.out.println("Цена: " + product.getPrice());
            System.out.println("Рейтинг: " + product.getRating());
            System.out.println("--------------------------");
        }
    }
}
