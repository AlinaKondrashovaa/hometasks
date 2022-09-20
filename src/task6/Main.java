package task6;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(rez(a));
    }
    public static boolean rez( int a){
        if (a>=0){
            return false;
        } else{
            return true;
        }
    }
}
