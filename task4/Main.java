package task4;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Монитор", 200.0, 4);
        Product product2 = new Product("Клавиатура", 50.0, 5);
        Product product3 = new Product("Мышь", 20.0, 3);

        Product[] purchasedProducts = { product1, product2, product3 };

        Basket basket = new Basket(purchasedProducts);

        User user1 = new User("user1", "password1", basket);
        User user2 = new User("user2", "password2", basket);

        System.out.println("Пользователь: " + user1.getUsername());
        System.out.println("Корзина пользователя: " + user1.getBasket());

        System.out.println("Пользователь: " + user2.getUsername());
        System.out.println("Корзина пользователя: " + user2.getBasket());
    }
}
