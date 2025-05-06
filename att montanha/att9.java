import java.util.Arrays;

public class att9 {
    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5,6}, v2 = {4,5,6,7,8,9};
        for (int num : v1) {
            for (int num2 : v2) {
                if (num == num2) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
