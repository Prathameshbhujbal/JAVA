class Operators {
    int addition(int x, int y){
        return x + y;
    }
    int subtract(int x, int y) {
        return x - y;
    }
    
    int multiply(int x, double y) {
        return x * y;
    }
    double multiply (double x, double y) {
        return x * y;
    }
    int division(double x, double y) {
        return x / y;
    }
    
}

public class Math {
    public static void main(String args[]) {
     int x = 7,y = 5;
     
     Operators z = new Operators();
     System.out.println("Sum of" +x+ "and" +y+ "is" +z.addition(x,y));
     
     System.out.println("Subtration of" +x+ "and" +y+ "is" +z.subtract(x,y));
     
     System.out.println("Multiplication of" +x+ "and" +y+ "is" +z.multiply(x,y));
     
     System.out.println("Multiplication of" +x+ "and" +y+ "is" +z.multiply(x,y));
     
     System.out.println("Division of" +x+ "and" +y+ "is" +z.division(x,y));
     

      
    }
}