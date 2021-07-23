import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public int getWeightBox() {
        int totalWeight = 0;

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
            System.out.println("Название: " + sweetness.getName() +
                    " Вес: " + sweetness.getWeight() + " Цена: " + sweetness.getPrice() +
                    " Уникальный параметр: " + sweetness.getUniqueParameter());
        }
    }

    // Два метода для умной оптимизации подарка, для удаления сладостей
    // с меньшим весом и меньшей ценой из коробки до тех пор, пока вес коробки
    // не станет меньше входного параметра.

    public void sortedBoxByWeight() {
        Collections.sort(sweetnessList, new Comparator<Sweetness>() {
            public int compare(Sweetness o1, Sweetness o2) {
                return o2.getWeight() - o1.getWeight();    // сортировка по убыванию веса
            }
        });
    }

    public void sortedBoxByPrice() {
        Collections.sort(sweetnessList, new Comparator<Sweetness>() {
            public int compare(Sweetness o1, Sweetness o2) {
                return o2.getPrice() - o1.getPrice();    // сортировка по убыванию цены
            }
        });
    }

    public void optimizeByWeight(int weight) {
        if(weight < 0) {
            System.out.println("Передайте в параметре положительное число");
            return;
        }

        sortedBoxByWeight();
        while(getWeightBox() > weight){
            removeLast();
        }

        if (sweetnessList.size() == 0) System.out.println("Коробка пуста");
    }

    public void optimizeByPrice(int weight) {
        if(weight < 0) {
            System.out.println("Передайте в параметре положительное число");
            return;
        }

        sortedBoxByPrice();
        while(getWeightBox() > weight){
            removeLast();
        }

        if (sweetnessList.size() == 0) System.out.println("Коробка пуста");
    }
}
