import java.util.Arrays;
import java.util.Scanner;

public class att7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[15];
        for (int i = 0; i < 15; i++) v[i] = s.nextInt();
        int n = s.nextInt();
        System.out.println(Arrays.stream(v).filter(x -> x == n).count());
        s.close();
    }
}
