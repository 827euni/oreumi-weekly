import java.math.BigDecimal;
class ItemManger{
    public static void main(String[] args) {
        Grocery grocery = new Grocery("수분크림", 70000, 8);
        Beauty beauty = new Beauty("수분크림", 120000, 7.0);
        LargeAppliance largeAppliance = new LargeAppliance("수분크림", 7000, 1.0);

        DeliveryChargeCalculator deliveryCalculator = new DeliveryChargeCalculator.DeliveryCalculator();

        BigDecimal GrocerydeliveryCharge = deliveryCalculator.getDeliveryCharge(grocery.getWeight(), grocery.getPrice());
        BigDecimal BeautydeliveryCharge = deliveryCalculator.getDeliveryCharge(beauty.getWeight(), beauty.getPrice());
        BigDecimal LargedeliveryCharge = deliveryCalculator.getDeliveryCharge(largeAppliance.getWeight(), largeAppliance.getPrice());
        BigDecimal totalDeliveryCharge = GrocerydeliveryCharge.add(BeautydeliveryCharge).add(LargedeliveryCharge);

        System.out.println("식료품 배송료: " + GrocerydeliveryCharge);
        System.out.println("화장품 배송료: " + BeautydeliveryCharge);
        System.out.println("대형가전 배송료: " + LargedeliveryCharge);
        System.out.println("총 배송료: " + totalDeliveryCharge);

    }
}