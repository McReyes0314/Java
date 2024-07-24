//Separate all odd from even numbers
public class Lab1 {
   public static void oddOrEven(int[] n){
       System.out.print("Array elements: ");
       int i; 

       for(i = 0; i < n.length; i++){
          System.out.print(n[i] + " ");
       }

       System.out.println();
       
       System.out.print("Even Numbers: ");
       for(i = 0; i < n.length; i++){
         if(n[i] % 2 == 0){
            System.out.print(n[i] + " ");
         }
       }

       System.out.println();

       System.out.print("Odd Numbers: ");
       for(i = 0; i < n.length; i++){
         if(n[i] % 2 != 0){
            System.out.print(n[i] + " ");
         }
       }
   }
   
   public static void main(String[] args) {
        int[] n = {33, 2, 70, 4, 52, 42, 8, 35, 9, 211};
        oddOrEven(n);
   }
}