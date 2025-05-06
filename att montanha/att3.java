import java.util.Arrays;
import java.util.Scanner;

public class att3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[20];
        for (int i = 0; i < 20; i++) v[i] = s.nextInt();
        System.out.println(Arrays.stream(v).filter(x -> x % 2 == 0).count());
        s.close();
    }
}
