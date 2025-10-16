public class Main {
    public static void main(String[] args) {

        Food1 f1 = new Food1();
        f1.setName("Thai Soup");
        System.out.println("Favorite food (Setter/Getter): " + f1.getName());


        Food2 f2 = new Food2("Thai Soup");
        System.out.println("Favorite food (Constructor): " + f2.getName());

        Food3 f3 = new Food3();
        f3.name = "Thai Soup";
        System.out.println("Favorite food (Direct Access): " + f3.name);


        Food4.display();
    }
}
