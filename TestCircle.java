import java.util.Scanner;

public class TestCircle {
    static Scanner sc = new Scanner(System.in);
    public static void c1(){
        Circle c1 = new Circle();
        
        System.out.print("Enter Radius: ");
        c1.setRadius(sc.nextDouble());
        double rad = c1.getRadius();

        double area = c1.computeArea((rad));
        double diameter = c1.computeDiameter(rad);
        
        System.out.println("Area of the circle: " + area + "\nDiameter of the circle: " + diameter);
    }
    
    public static void main(String[] args) {
       c1();
    }
}
