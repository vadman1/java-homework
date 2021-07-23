public class Cookie extends Sweetness{

    public Cookie() { }

    public Cookie(String name, int weight, int price, String uniqueParameter) {
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
