package task1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Монитор", 200.0, 4);
        System.out.println("Название товара: " + product1.getName());
        System.out.println("Цена товара: " + product1.getPrice());
        System.out.println("Рейтинг товара: " + product1.getRating());

        product1.setPrice(250.0);
        System.out.println("Обновленная цена товара: " + product1.getPrice());
    }
}
