import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = {5,7,6,4};
        System.out.println(Arrays.toString(p));
        change(p);
        System.out.println(Arrays.toString(p));
        System.out.println("hello world");
    }
    static void change(int[] arr){
        arr[0]=33;
    }
}
