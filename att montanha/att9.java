import java.util.Arrays;

public class att9 {
    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5,6}, v2 = {4,5,6,7,8,9};
        System.out.println(Arrays.toString(Arrays.stream(v1).filter(x -> Arrays.stream(v2).anyMatch(y -> y == x)).toArray()));
    }
}
