import java.io.*;

class Example1{
    public static void main(String[] args) 
        throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter firstname: ");
            String firstName = (br.readLine());

            System.out.println("Enter lastname: ");
            String lastName = (br.readLine());

            System.out.println("Enter Age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.println("Enter Weight: ");
            double Weight = Double.parseDouble(br.readLine());

            System.out.println("Firstname: " + firstName);
            System.out.println("Lastname: " + lastName);
            System.out.println("Age: " + age);
            System.out.format("Weight: " + Weight);
        }
}