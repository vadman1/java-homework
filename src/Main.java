public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        Chocolate chocolate = new Chocolate("Шоколад", 200, 100, "Параметр шоколада");
        Cookie cookie = new Cookie("Печенье", 300, 200, "Параметр печенья");
        Cookie cookie2 = new Cookie("Печенье2", 100, 500, "Параметр печенья2");

        box.addSweetness(chocolate);
        box.addSweetness(cookie);
        box.addSweetness(cookie2);

        box.showAllInformation();

        System.out.println("===========");
        box.optimizeByPrice(500);
        box.showAllInformation();

    }

}


