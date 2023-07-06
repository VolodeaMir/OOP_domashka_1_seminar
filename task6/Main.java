package task6;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        store.addProduct(new Product("Монитор", 200.0, 4));
        store.addProduct(new Product("Клавиатура", 50.0, 5));
        store.addProduct(new Product("Мышь", 20.0, 3));

        User user1 = new User("user1", "password1", new Basket());
        User user2 = new User("user2", "password2", new Basket());

        Product product1 = store.getAllProducts().get(0);
        Product product2 = store.getAllProducts().get(1);
        user1.getBasket().addProduct(product1);
        user1.getBasket().addProduct(product2);
        store.removeProduct(product1);
        store.removeProduct(product2);

        Product product3 = store.getAllProducts().get(0);
        user2.getBasket().addProduct(product3);
        store.removeProduct(product3);

        System.out.println("Покупки пользователя " + user1.getUsername() + ":");
        for (Product product : user1.getBasket().getAllProducts()) {
            System.out.println("- " + product.getName());
        }

        System.out.println("Покупки пользователя " + user2.getUsername() + ":");
        for (Product product : user2.getBasket().getAllProducts()) {
            System.out.println("- " + product.getName());
        }
    }
}
