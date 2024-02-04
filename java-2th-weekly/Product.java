import java.math.BigDecimal;

public abstract class Product {
    private String name;
    private BigDecimal price;
    private Double weight;

    public Product(String name, BigDecimal price, Double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

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
