/**
 * Write a program that declares a variable that represents the minutes worked on a job 
   and assign a value.  Display the value in hours and minutes.  For example, 125 
   minutes becomes 2 hours and 5 minutes 
    
   Sample output:  Given  : 125 minutes 
   Converted hours: 2 hours  and 5 minute/s
 */

 import java.util.Scanner;

class Lab5{
    public static void convert(int time){
      int hr = time / 60;
      int min = time % 60;

      if(min == 0){
        System.out.println("Conversion: " + hr + " hours ");
      }else{
        System.out.println("Conversion: " + hr + " hours " + " and " + min + " minutes/s");
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Time (in minutes): ");
        int time = sc.nextInt();
 
       convert(time);
    }
 }