import java.math.BigDecimal;

public class Cart {
    Product[] products;

    public Cart(Product[] products){
        this.products = products;
    }

    public BigDecimal calculateDeliveryCharge() {
        BigDecimal totalWeight = new BigDecimal("0");
        BigDecimal totalPrice = new BigDecimal("0");
        for (Product product : products) {
            totalWeight = totalWeight.add(BigDecimal.valueOf(product.getWeight()));
            totalPrice = totalPrice.add(product.getPrice().subtract(product.getDiscountAmount()));
        }
        final BigDecimal price_under_3 = new BigDecimal("1000");
        final BigDecimal price_over_3_under_10 = new BigDecimal("5000");
        final BigDecimal price_over_10 = new BigDecimal("10000");
        final BigDecimal weight_3 = new BigDecimal("3");
        final BigDecimal weight_10 = new BigDecimal("10");
        final BigDecimal price_3 = new BigDecimal("30000");
        final BigDecimal price_10 = new BigDecimal("100000");
        final BigDecimal discount = new BigDecimal("1000");
        BigDecimal delivery;
        BigDecimal charge;


        if (totalWeight.compareTo(weight_3)<0){
            delivery = price_under_3;
        }
        else if(totalWeight.compareTo(weight_3) >= 0 && totalWeight.compareTo(weight_10) < 0){
            delivery = price_over_3_under_10;
        }
        else{
            delivery = price_over_10;
        }

        if (totalPrice.compareTo(price_3)<0) {
            charge = delivery;
        }
        else if (totalPrice.compareTo(price_3) >= 0 && totalPrice.compareTo(price_10) < 0){
            charge = delivery.subtract(discount);
        }
        else if (totalPrice.compareTo(price_10) >= 0){
            charge = delivery.subtract(delivery);
        }
        else{
            charge = delivery.subtract(discount);
        }
        return charge;
    }

}