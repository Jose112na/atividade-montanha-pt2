import java.util.Scanner;

public class att4 {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[8];
        for (int i = 0; i < 8; i++) {
            v[i] = s.nextInt();
        }
        for (int i = 7; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        s.close();
    }
}
