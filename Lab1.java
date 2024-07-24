import java.util.*;

class Lab1{
    public static int input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    public static void numberPattern(int n){
        int r, c; 

        //loop for row
        for(r = 1; r <= n; r++){
            //loop to handles number
           for(c = 1; c <= r; c++){
                System.out.print(c + " ");
           }
           //print new lines for row
           System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int n = input();
        numberPattern(n);
    }
}