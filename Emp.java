import java.util.Scanner; 
public class Emp {
    static Scanner sc = new Scanner(System.in);

    public static void emp1(){
        Employee emp1 = new Employee();
        System.out.print("Employee Id: ");
        emp1.setId(sc.nextLine());
        String id = emp1.getId(); 

        System.out.print("Name: ");
        emp1.setName(sc.nextLine());
        String name = emp1.getName(); 

        System.out.println("Employee 1: | ID: " + id + " | Name: " + name);
    }

    public static void emp2(){
        Employee emp2 = new Employee();
        System.out.print("Employee Id: ");
        emp2.setId(sc.nextLine());
        String id = emp2.getId(); 

        System.out.print("Name: ");
        emp2.setName(sc.nextLine());
        String name = emp2.getName(); 

        System.out.println("Employee 1: | ID: " + id + " | Name: " + name);
    }

    public static void emp3(){
        Employee emp3 = new Employee();

        System.out.print("Employee Id: ");
        emp3.setId(sc.nextLine());
        String id = emp3.getId(); 

        System.out.print("Name: ");
        emp3.setName(sc.nextLine());
        String name = emp3.getName(); 

        System.out.println("Employee 1: | ID: " + id + " | Name: " + name);
    }
    public static void main(String[] args) {
        emp1();
        emp2();
        emp3();
    }
}
