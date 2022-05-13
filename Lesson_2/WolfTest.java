public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "white fang";
        wolfOne.gender = "male";
        wolfOne.furColor = "white";
        wolfOne.weight = 104;
        wolfOne.age = 7;

        System.out.println("wolfOne name = " + wolfOne.name);
        System.out.println("wolfOne gender = " + wolfOne.gender);
        System.out.println("wolfOne furColor = " + wolfOne.furColor);
        System.out.println("wolfOne weight = " + wolfOne.weight);
        System.out.println("wolfOne age = " + wolfOne.age);

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}