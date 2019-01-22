class Bmi {

    public static void main(String[] args) {
        
        double height = Double.parseDouble(args[0]);
        double weight = Double.parseDouble(args[1]);
        
        height = height / 100;
        double bmi = weight / height / height;
        
        System.out.println("bmi=" + bmi);
        
    }

}
