//Display the highest number (without sorting)
public class Lab2 {
    public static int highNum(int n[]){
        int i;
        int num = n[0]; 
        for(i = 0; i < n.length; i++){
            if(n[i] > num){
                num = n[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] n = {33, 2, 70, 4, 52, 42, 8, 35, 9, 221};
        int hn = highNum(n);
        System.out.println("Highest number: " + hn);
    }
}
