public class Chocolate extends Sweetness {

    public Chocolate() { }

    public Chocolate(String name, double weight, int price, String uniqueParameter) {
        setName(name);
        setWeight(weight);
        setPrice(price);
        setUniqueParameter(uniqueParameter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }

    public void setUniqueParameter(String uniqueParameter) {
        this.uniqueParameter = uniqueParameter;
    }
}
