import java.util.Scanner;

public class Lab6 {
    public static void denomination(int cash){
       int[] a1 = new int[8];
       int[] a2 = new int[8];
       a1[0] = 1000;
       a1[1] = 500;
       a1[2] = 100;
       a1[3] = 50;
       a1[4] = 20; 
       a1[5] = 10; 
       a1[6] = 5; 
       a1[7] = 1;
      

       int i = 0;
       int c = 0;
       do{
        if(cash >= a1[i]){
            int compute = (cash % a1[i]);
            c = cash / a1[i];
            a2[i] = c;
            cash = compute;
        }
        System.out.println(a1[i] + " = " + a2[i]);
        i++;
       }while(cash != 0);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Cash on hand: ");
       int cash = sc.nextInt();
       denomination(cash);
    }
}
