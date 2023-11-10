class BasicProductFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new BasicProduct();
    }
}