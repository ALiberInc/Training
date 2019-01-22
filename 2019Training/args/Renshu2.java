import java.util.Random;

class Renshu2 {

    public static void main(String[] args) {
        
        int max = Integer.parseInt(args[0]);
        
        Random rand = new Random();
        int num = rand.nextInt(max);
        
        System.out.println("‘I‚Î‚ê‚½”‚Í" + num);
    }
    
}
