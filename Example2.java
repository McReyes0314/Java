import java.util.Scanner;
public class Example2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String lastName, firstName; 
        int age; 
        double weight; 

        System.out.print("Enter LastName: ");
        lastName = sc.nextLine();
        System.out.print("Enter FirstName: ");
        firstName = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Weight: ");
        weight = sc.nextDouble();

        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
