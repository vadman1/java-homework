import java.util.ArrayList;
import java.util.List;

public class Box implements BoxInterface {
    private final List<Sweetness> sweetnessList = new ArrayList();


    public void addSweetness(Sweetness sweetness) {
        sweetnessList.add(sweetness);
    }

    public Sweetness remove(int index) {
        return sweetnessList.remove(index);
    }

    public Sweetness removeLast() {
        return sweetnessList.remove(sweetnessList.size() - 1);
    }

    public double getWeightBox() {
        double totalWeight = 0;

        for (Sweetness sweetness : sweetnessList) {
            totalWeight += sweetness.getWeight();
        }

        return totalWeight;
    }


    public int getPriceBox() {
        int totalPrice = 0;

        for (Sweetness sweetness : sweetnessList) {
            totalPrice += sweetness.getPrice();
        }

        return totalPrice;
    }


    public void showAllInformation() {
        for (Sweetness sweetness : sweetnessList) {
            System.out.println(sweetness.getName() + " " + sweetness.getWeight() + " " + sweetness.getPrice() +
                    " " + sweetness.getUniqueParameter());
        }
    }

    // Два метода для умной оптимизации подарка, для удаления сладостей
    // с меньшим весом и меньшей ценой из коробки до тех пор, пока вес коробки
    // не станет меньше входного параметра.

    /*
    public void sortedBox() {

    }

    public void optimizeByWeight(double weight) {
        while(weight > getWeightBox()){

        }
    }

    public void optimizeByPrice(double weight) {

    }*/
}
