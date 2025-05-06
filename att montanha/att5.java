import java.util.Arrays;
import java.util.Scanner;

public class att5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[12];
        int soma = 0, contador = 0;
        for (int i = 0; i < 12; i++) {
            v[i] = s.nextInt();
            soma += v[i];
        }
        double media = soma / 12.0;
        System.out.println(media);
        for (int num : v) {
            if (num > media) {
                contador++;
            }
        }
        System.out.println(contador);
        s.close();
    }
}
