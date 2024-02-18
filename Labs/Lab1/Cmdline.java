package Labs.Lab1;
import java.util.Scanner;
public class Cmdline{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = input.nextLine();
        String messageArray[]= message.split(" ");
        for(int i = 0; i < messageArray.length; i++){
            System.out.println("Argument " + i + " is " + messageArray[i]);
        }
        input.close();
    }

}