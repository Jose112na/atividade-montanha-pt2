import java.util.Arrays;
import java.util.Scanner;

public class att2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[15];
        int maior = Integer.MIN_VALUE, posicao = 0;
        for (int i = 0; i < 15; i++) {
            v[i] = s.nextInt();
            if (v[i] > maior) {
                maior = v[i];
                posicao = i;
            }
        }
        System.out.println(maior + " " + posicao);
        s.close();
    }
}
