public interface BoxInterface {
    void addSweetness(Sweetness sweetness);
    Sweetness remove(int index);
    Sweetness removeLast();
    double getWeightBox();
    int getPriceBox();
    void showAllInformation();
}
