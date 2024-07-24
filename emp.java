import java.util.Scanner;

public class emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();

        String lname, fname, job;
        int age;

        System.out.print("Enter last name: ");
        lname = sc.nextLine();
        
        System.out.print("Enter first name: ");
        fname = sc.nextLine();

        emp1.setName(lname, fname);
        lname = emp1.getLname();
        fname = emp1.getFname();

        System.out.print("Age: ");
        emp1.setAge(sc.nextInt());
        age = emp1.getAge();

        System.out.print("Job: ");
        emp1.setJob(sc.nextLine());
        job = emp1.getJob();

        System.out.println("Employee 1: \nName: " + lname + ", " + fname);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
    }
}