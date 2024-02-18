package Labs.Lab1;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        String total = "";
        for(int i=1; i<=num; i++){
            total += i + " ";
            System.out.println(total);
        }
        in.close();
    }
}
