public abstract class Sweetness {
    protected String name;
    protected double weight;
    protected int price;
    protected String uniqueParameter;


    public abstract String getName();

    public abstract void setName(String name);

    public abstract double getWeight();

    public abstract void setWeight(double weight);

    public abstract int getPrice();

    public abstract void setPrice(int price);

    public abstract String getUniqueParameter();

    public abstract void setUniqueParameter(String uniqueParameter);
}
