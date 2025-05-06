import java.util.Arrays;
import java.util.Scanner;

public class att10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = IntStream.range(0, 10).map(i -> s.nextInt()).toArray();
        Arrays.sort(v);
        System.out.println(Arrays.toString(v));
        s.close();
    }
}
