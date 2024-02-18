package Labs.Lab1;
import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int n = in.nextInt();
        in.close();
        int num = fact(n);
        System.out.println("The factorial value of " + n + " is " + num +".");
    }
}
