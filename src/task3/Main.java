package task3;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        System.out.println( chet(a,b,c,d));
    }
    public static double chet(double a, double b, double c, double d){
        return a * (b + (c / d));
    }
}
