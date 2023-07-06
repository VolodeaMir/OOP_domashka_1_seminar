package task2;

public class Category {
    private String name;
    private Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public Category() {
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Product[] getProducts() {
        return products;
    }

    protected void setProducts(Product[] products) {
        this.products = products;
    }
}
