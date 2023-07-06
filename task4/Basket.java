package task4;

public class Basket {
    private Product[] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    public Basket() {
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product.getName()).append(", ");
        }

        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

}