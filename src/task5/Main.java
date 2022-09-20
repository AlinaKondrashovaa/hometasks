package task5;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        rez(a);
    }
    public static void rez( int a){
        if (a>=0){
            System.out.println("Число положительное");
        } else{
            System.out.println("Число отрицательное");
        }
    }
}
