package task4;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println( rez(a,b));
    }
    public static boolean rez( int a, int b){
        if (((a+b)<=20) && ((a+b)>10)){
            return true;
        } else{
            return false;
        }
    }
}
