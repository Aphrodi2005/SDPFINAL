class GiftWrapDecorator extends ProductDecorator {
    private Product product;

    public GiftWrapDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " with Gift Wrap";
    }

    @Override
    public double cost() {
        return product.cost() + 5.0;
    }
}