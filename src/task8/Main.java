package task8;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
         god(a);
    }
    public static void god( int a){
        if ((a%4==0)&& (a%100!=0)){
            System.out.println("Год високосный");
        } else{
            if(a%400==0){
                System.out.println("Год високосный");
            }else{
                System.out.println("Год невисокосный");

            }
        }
    }
}
