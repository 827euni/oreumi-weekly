import java.math.BigDecimal;

public class LargeAppliance extends Product{
    LargeAppliance(String name, int price, double weight){
        super(name, price, weight);
    }

    public BigDecimal getDiscountAmount() {
        return new BigDecimal("0");
    }
}