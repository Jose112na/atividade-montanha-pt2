import java.util.Arrays;
import java.util.Scanner;

public class att5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[12];
        for (int i = 0; i < 12; i++) v[i] = s.nextInt();
        double media = Arrays.stream(v).average().getAsDouble();
        System.out.println(media);
        System.out.println(Arrays.stream(v).filter(x -> x > media).count());
        s.close();
    }
}
