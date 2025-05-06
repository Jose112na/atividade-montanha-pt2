import java.util.Arrays;

public class att8 {
   public static void main(String[] args) {
        int[] a = {1,2,3,4,5}, b = {6,7,8,9,10}, c = new int[10];
        for (int i = 0; i < 5; i++) {
            c[i] = a[i];
            c[i + 5] = b[i];
        }
        for (int num : c) {
            System.out.print(num + " ");
        }
    }
}
