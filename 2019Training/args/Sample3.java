import java.util.Random;

class Sample3 {

    public static void main(String[] args) {

        Random rand = new Random();
        int num = rand.nextInt(10);
        
        System.out.println("ラッキーナンバーは" + num);
    }
}
