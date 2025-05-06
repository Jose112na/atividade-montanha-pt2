import java.util.Arrays;
import java.util.Scanner;

public class att3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[20];
        int contador = 0;
        for (int i = 0; i < 20; i++) {
            v[i] = s.nextInt();
            if (v[i] % 2 == 0) {
                contador++;
            }
        }
        System.out.println(contador);
        s.close();
    }
}
