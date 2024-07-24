import java.util.Scanner;


public class Lab{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            int n = 3;
            System.out.print("Nested Loop Lab\n[1] a\n[2] b \n[3] c\n[4] d \n]");
            System.out.print("[5] e \n [6] f \n[7] g \n[8] h [9] Exit\nInput: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:  
                    System.out.println("Output: ");  
                    for(int i = n; i >= 1; i--){
                        for(int j = 1; j <= i; j++){
                           System.out.print(j + " "); 
                        }
                        System.out.println(); 
                     }
                     break;
                case 2: 
                    System.out.println("Output: ");
                    for(int i = 1; i <= n; i++){
                        for(int j = n; j >= i; j--){
                        System.out.print(j + " "); 
                        }
                        System.out.println(); 
                    }
                    break; 
                case 3: 
                    System.out.println("Output: ");
                    break; 
                case 4: 
                    System.out.println("Output: ");
                    for(int i = n; i >= 1; i--){
                        for(int j = n; j >= i; j--){
                        System.out.print(j + " "); 
                        }
                        System.out.println(); 
                    }
                    break; 
                case 5: 
                    break; 
                case 6: 
                    break; 
                case 7: 
                    break; 
                case 8:
                    break;
                case 9: 
                    System.out.println("-------------------------------");
                    System.out.println("End of program");
                    System.out.println("-------------------------------");
                    System.exit(0);
                default:
                    System.out.println("Invalid input: It should be from 1-6");
                    break;
            }
        }while(true);
    }
}