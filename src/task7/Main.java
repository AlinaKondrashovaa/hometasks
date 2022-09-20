package task7;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner scanner= new Scanner(System.in);
        String s=scanner.next();
        System.out.println(name(s));

    }
    public static String name(String n){
        String s="Привет, " +n+"!";
        return s;
    }
}
