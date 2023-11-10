
// Decorator Pattern
abstract class Product {
    String description = "Unknown Product";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
