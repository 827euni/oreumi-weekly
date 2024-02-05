import java.math.BigDecimal;

public abstract class Product implements Promotion {
    private String name;
    private BigDecimal price;
    private Double weight;

    public Product(String name, int price, double weight){
        this.name = name;
        this.price = BigDecimal.valueOf(price);
        this.weight = weight;
    }
    @Override
    public abstract BigDecimal getDiscountAmount();
    public String getName(){
        return name;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public Double getWeight() {
        return weight;
    }

}