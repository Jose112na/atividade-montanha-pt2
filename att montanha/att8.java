import java.util.Arrays;

public class att8 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5}, b = {6,7,8,9,10}, c = new int[10];
        System.arraycopy(a, 0, c, 0, 5);
        System.arraycopy(b, 0, c, 5, 5);
        System.out.println(Arrays.toString(c));
    }
}
