public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        Chocolate chocolate = new Chocolate("Шоколад", 200, 100, "Параметр шоколада");
        Cookie cookie = new Cookie("Печенье", 300, 200, "Параметр печенья");

        box.addSweetness(chocolate);
        box.addSweetness(cookie);
        box.showAllInformation();

        System.out.println();

        box.removeLast();
        box.showAllInformation();

    }

}


