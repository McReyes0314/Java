//display the lowest number (without sorting)
public class Lab3 {
    public static int lowNum(int[] n){
       int ln = n[0];
       for(int i = 0; i < n.length; i++){
          if(n[i] < ln){
             ln = n[i];
          }
       } 
       return ln;
    }
    public static void main(String[] args) {
        int [] n = {33, 2, 70, 4, 52, 42, 8, 35, 9, 211};
        int ln = lowNum(n);
        System.out.println("Lowest Number: " + ln);
    }
}
