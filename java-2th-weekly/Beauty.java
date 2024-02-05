import java.math.BigDecimal;

public class Beauty extends Product{
    Beauty(String name, int price,double weight){
        super(name, price, weight);
    }
    public BigDecimal getDiscountAmount() {
        return new BigDecimal("10000");
    }

}