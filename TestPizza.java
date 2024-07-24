import java.util.Scanner; 
public class TestPizza {
   public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);
     Pizza p1 = new Pizza();
     //class variables of Pizza (non-initiated)
     System.out.println("Toppings: " + p1.toppings);
     System.out.println("Diameter: " + p1.diameter);
     System.out.println("Prize: " + p1.prize);

     //initiated variables of class pizza 
     System.out.print("Enter a Toppings: ");
     p1.setToppings(sc.nextLine());
     String toppings = p1.getToppings();

     System.out.print("Diameter: ");
     p1.setDiameter(sc.nextInt());
     int diameter = p1.getDiameter();

     double prize = 1.50;
     double compute = prize * diameter;
     p1.setPrize(compute);

     System.out.println("Toppings: " + toppings);
     System.out.println("Diameter: " + diameter);
     System.out.println("Prize: " + p1.getPrize());
   }
}
