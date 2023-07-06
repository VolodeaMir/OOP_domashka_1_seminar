package task2;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Монитор", 200.0, 4);
        Product product2 = new Product("Клавиатура", 50.0, 5);
        Product product3 = new Product("Мышь", 20.0, 3);

        Category category1 = new Category("Компьютерная техника", new Product[] { product1, product2 });
        Category category2 = new Category("Аксессуары", new Product[] { product2, product3 });

        category1.setName("Электроника");

        System.out.println("Категория: " + category1.getName());
        System.out.println("Товары в категории: ");
        for (Product product : category1.getProducts()) {
            System.out.println(" - " + product.getName());
        }

        System.out.println("Категория: " + category2.getName());
        System.out.println("Товары в категории: ");
        for (Product product : category2.getProducts()) {
            System.out.println(" - " + product.getName());
        }
    }
}
