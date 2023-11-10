class BasicProduct extends Product {
    public BasicProduct() {
        description = "Basic Product";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
