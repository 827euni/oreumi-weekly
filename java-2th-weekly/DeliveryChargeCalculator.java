import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    BigDecimal getDeliveryCharge(Double weight, BigDecimal price);


    public class DeliveryCalculator implements DeliveryChargeCalculator {
        private static final BigDecimal price_under_3 = new BigDecimal("1000");
        private static final BigDecimal price_over_3_under_10 = new BigDecimal("5000");
        private static final BigDecimal price_over_10 = new BigDecimal("10000");
        private static final BigDecimal weight_3 = new BigDecimal("3");
        private static final BigDecimal weight_10 = new BigDecimal("10");
        private static final BigDecimal price_3 = new BigDecimal("30000");
        private static final BigDecimal price_10 = new BigDecimal("100000");
        private static final BigDecimal discount = new BigDecimal("1000");


        @Override
        public BigDecimal getDeliveryCharge(Double weight, BigDecimal price) {
            return null;
        }
    }
}

