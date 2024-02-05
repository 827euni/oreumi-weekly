import java.math.BigDecimal;

public class Grocery extends Product{
    Grocery(String name, int price, double weight){
        super(name, price, weight);
    }

    public BigDecimal getDiscountAmount() {
        return new BigDecimal("2000");
    }
}