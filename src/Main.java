import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] k = {5,7,6,4};
        System.out.println(Arrays.toString(k));
        change(k);
        System.out.println(Arrays.toString(k));
    }
    static void change(int[] arr){
        arr[0]=33;
    }
}