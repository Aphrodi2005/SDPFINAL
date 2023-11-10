class ShippingServiceAdapter implements ShippingService {
    private ThirdPartyShippingService thirdPartyService;

    public ShippingServiceAdapter(ThirdPartyShippingService thirdPartyService) {
        this.thirdPartyService = thirdPartyService;
    }

    @Override
    public void ship() {

        String packageDetails = "Default package details";
        thirdPartyService.send(packageDetails);
    }
}
