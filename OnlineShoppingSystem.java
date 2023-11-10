public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Singleton Example
        ShoppingCart cart = ShoppingCart.getInstance();

        // Strategy Example
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy payPalPayment = new PayPalPayment();

        // Decorator Example
        Product basicProduct = new BasicProduct();
        Product decoratedProduct = new GiftWrapDecorator(basicProduct);

        // Adapter Example
        ThirdPartyShippingService thirdPartyService = new ThirdPartyShippingService();
        ShippingService shippingService = new ShippingServiceAdapter(thirdPartyService);

        // Observer Example
        Order order = new Order();
        User user1 = new User("User1");
        User user2 = new User("User2");

        order.addObserver(user1);
        order.addObserver(user2);

        // Factory Example
        ProductFactory productFactory = new BasicProductFactory();
        Product newProduct = productFactory.createProduct();

        // Simulate a shopping scenario
        cart.addProduct(decoratedProduct);
        cart.addProduct(newProduct);

        // Strategy: Select payment method
        creditCardPayment.pay(cart.calculateTotal());

        // Observer: Place an order
        order.setStatus("Order Placed");

        // Adapter: Ship the order
        shippingService.ship();

        // Checkout the shopping cart
        cart.checkout();
    }
}
