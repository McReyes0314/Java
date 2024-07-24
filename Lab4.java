//Sort the numbers in ascending order
public class Lab4 {
    public static void sort(int[] n){
       int temp = 0;
       for(int i = 0; i < n.length; i++){
         for(int j = i + 1; j < n.length; j++){
            if(n[i] > n[j]){
               temp = n[i];
               n[i] = n[j];
               n[j] = temp;
            }
         }
       }
      
       for(int i = 0; i < n.length; i++){
         System.out.print(n[i] + " ");
       }
     
    }
    public static void main(String[] args) {
        int[] n = {33, 2, 70, 4, 52, 42, 8, 35, 9, 211}; 
        sort(n);
    }
}
