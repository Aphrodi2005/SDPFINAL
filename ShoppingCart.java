// Singleton Pattern
import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private static ShoppingCart instance;
    private List<Product> products;

    private ShoppingCart() {
        products = new ArrayList<>();
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added product to the shopping cart: " + product.getDescription());
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Removed product from the shopping cart: " + product.getDescription());
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.cost();
        }
        return total;
    }

    public void checkout() {
        System.out.println("Checkout completed. Total amount: $" + calculateTotal());

    }}