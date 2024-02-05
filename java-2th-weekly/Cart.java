import java.math.BigDecimal;

public class Cart {
    Product[] products;

    public Cart(Product[] products){
        this.products = products;
    }

    public BigDecimal calculateDeliveryCharge(Double weight, BigDecimal price) {
        final BigDecimal price_under_3 = new BigDecimal("1000");
        final BigDecimal price_over_3_under_10 = new BigDecimal("5000");
        final BigDecimal price_over_10 = new BigDecimal("10000");
        final BigDecimal weight_3 = new BigDecimal("3");
        final BigDecimal weight_10 = new BigDecimal("10");
        final BigDecimal price_3 = new BigDecimal("30000");
        final BigDecimal price_10 = new BigDecimal("100000");
        final BigDecimal discount = new BigDecimal("1000");
        BigDecimal totalWeight = new BigDecimal("0");
        BigDecimal delivery;
        BigDecimal charge;
        BigDecimal weightBig = BigDecimal.valueOf(weight);

        if (weightBig.compareTo(weight_3)<0){
            delivery = price_under_3;
        }
        else if(weightBig.compareTo(weight_3) >= 0 && weightBig.compareTo(weight_10) <= 0){
            delivery = price_over_3_under_10;
        }
        else{
            delivery = price_over_10;
        }

        if (price.compareTo(price_3)<0) {
            charge = delivery;
        }
        else if (price.compareTo(price_3) >= 0 && price.compareTo(price_10) < 0){
            charge = delivery.subtract(discount);
        }
        else if (price.compareTo(price_10) >= 0){
            charge = delivery.subtract(delivery);
        }
        else{
            charge = delivery;
        }
        return charge;
    }

}