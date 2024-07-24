/*
Task: 
    Create a program that uses variables to display the output below
Output: 
    Alenere, the friendly neighbor, waved at David as she walked by David’s 
    house. David smiled back and invited Alenere in for a cup of coffee.
*/
class Activity1 {
    public static void main(String[] args) {
        String name1, name2, pro1, food; // declaration of string variables
       
        // initialization of variables
        name1 = "Alenere"; 
        name2 = "David"; 
        pro1 = "She"; 
        food = "coffee"; 
        
        // using print formatting to display output 
        System.out.printf("%s, the freindly neighbor, waved at %s as %s walked by %s\'s house. \n%s smiled back and invited %s in for a cup of %s.", name1, name2, pro1, name2, name2, name1, food);
    }
}