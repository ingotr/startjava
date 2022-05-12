public class MyFirstGame {
    public static void main(String[] args) {
        int max = 100;
        int computerNum = (int) (Math.random() * max + 1);
        int playerNum = 50;
        
        while(playerNum != computerNum) {
            if(playerNum > computerNum) {
                System.out.println("Ваше число больше того, что загадал компьютер");
                playerNum--;
            } else if(playerNum < computerNum) {
                System.out.println("Ваше число меньше того, что загадал компьютер");
                playerNum++;
            }
        }
        System.out.println("Компьютер загадал: " + computerNum);
        System.out.println("Вы победили!");
    }
}