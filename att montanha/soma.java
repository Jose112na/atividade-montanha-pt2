import java.util.Arrays;

public class soma {
    public static void main(String[] args) {
        int[] v = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.stream(v).sum());
    }
}
