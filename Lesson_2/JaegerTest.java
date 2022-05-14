public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Cherno Alpha");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setOrigin("Russia");
        jaegerOne.setHeight(85.34f);
        jaegerOne.setWeight(2.412f);
        jaegerOne.setSpeed(3);
        jaegerOne.setStrength(10);
        jaegerOne.setArmor(10);

        System.out.println("jaegerOne modelName = " + jaegerOne.getModelName());
        System.out.println("jaegerOne mark = " + jaegerOne.getMark());
        System.out.println("jaegerOne origin = " + jaegerOne.getOrigin());
        System.out.println("jaegerOne height = " + jaegerOne.getHeight());
        System.out.println("jaegerOne weight = " + jaegerOne.getWeight());
        System.out.println("jaegerOne speed = " + jaegerOne.getSpeed());
        System.out.println("jaegerOne strength = " + jaegerOne.getStrength());
        System.out.println("jaegerOne armor = " + jaegerOne.getArmor());
        jaegerOne.drift();
        jaegerOne.scanKaiju();
        jaegerOne.useWeapon();
        System.out.println("");

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Striker Eureka");
        jaegerTwo.setMark("Mark-5");
        jaegerTwo.setOrigin("Australia");
        jaegerTwo.setHeight(76.2f);
        jaegerTwo.setWeight(1.850f);
        jaegerTwo.setSpeed(10);
        jaegerTwo.setStrength(10);
        jaegerTwo.setArmor(9);

        System.out.println("jaegerTwo modelName = " + jaegerTwo.getModelName());
        System.out.println("jaegerTwo mark = " + jaegerTwo.getMark());
        System.out.println("jaegerTwo origin = " + jaegerTwo.getOrigin());
        System.out.println("jaegerTwo height = " + jaegerTwo.getHeight());
        System.out.println("jaegerTwo weight = " + jaegerTwo.getWeight());
        System.out.println("jaegerTwo speed = " + jaegerTwo.getSpeed());
        System.out.println("jaegerTwo strength = " + jaegerTwo.getStrength());
        System.out.println("jaegerTwo armor = " + jaegerTwo.getArmor());
        jaegerTwo.drift();
        jaegerTwo.scanKaiju();
        jaegerTwo.useWeapon();
    }
}