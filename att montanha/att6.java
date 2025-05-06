import java.util.Arrays;
import java.util.Scanner;

public class att6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = {1,2,3,4,5,6,7,8,9,10};
        int r = s.nextInt();
        v = Arrays.stream(v).filter(x -> x != r).toArray();
        System.out.println(Arrays.toString(v));
        s.close();
    }
}
