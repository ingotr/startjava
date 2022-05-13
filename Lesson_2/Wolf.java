public class Wolf {

    String name;
    String gender;
    String furColor;
    int weight;
    int age;

    String walk() {
        System.out.println("Ходит");
        return "walking";
    }

    void sit() {
        System.out.println("Сидит");
    }

    void run() {
        System.out.println("Бежит");
    }

    void howl() {
        System.out.println("Воет");
    }

    void hunt() {
        System.out.println("Охотится");
    }
}