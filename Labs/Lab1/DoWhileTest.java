package Labs.Lab1;

public class DoWhileTest {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,8,9};
        int i = 0;
        int n = 0;
        do{
            n += arr[i];
            i++;
        }
        while(i<arr.length);
        System.out.println(n);
     }
}
