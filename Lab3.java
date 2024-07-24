public class Lab3 {
    public static void main(String[] args) {
        var Sagot = true; 
        int A = 2, B = 4;
        char letter = 'c';
        double Pi = 3.14;

        /*Write a Java program that prints the values of the variable above in this manner 
        * The value of A is 2 while B is 4 
        * Letter c 
        * Initial value of Sagot is true 
        * Pi contains the value 3.14 
        * Sagot is now false 
        */

        System.out.println("The value of A is " + A + " while B is " + B);
        System.out.println("Letter " + letter);
        System.out.println("Initial value of Sagot is " + Sagot);
        System.out.println("Pi contains the value " + Pi);
        
        if(A > B){
            Sagot = true;
        }
        else{
            Sagot = false;
        }

        System.out.println("Sagot is now " + Sagot);

        System.out.println(A + " * " + B + " = " + (A *= B));
    }
}
