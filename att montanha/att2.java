import java.util.Arrays;
import java.util.Scanner;

public class att2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[15];
        for (int i = 0; i < 15; i++) v[i] = s.nextInt();
        int max = Arrays.stream(v).max().getAsInt();
        System.out.println(max + " " + Arrays.asList(v).indexOf(max));
        s.close();
    }
}
