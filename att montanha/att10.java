import java.util.Arrays;
import java.util.Scanner;

public class att10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[10];
        for (int i = 0; i < 10; i++) {
            v[i] = s.nextInt();
        }
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
        for (int num : v) {
            System.out.print(num + " ");
        }
        s.close();
    }
}
