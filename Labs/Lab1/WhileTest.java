package Labs.Lab1;

public class WhileTest {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,8,9};
        int i = 0;
        int n = 0;
        while(i<arr.length){
            n += arr[i];
            i++;
        }
        System.out.println(n);
    }
}
