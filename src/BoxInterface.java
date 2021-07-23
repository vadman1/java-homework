public interface BoxInterface {
    void addSweetness(Sweetness sweetness);
    Sweetness remove(int index);
    Sweetness removeLast();
    int getWeightBox();
    int getPriceBox();
    void showAllInformation();
}
