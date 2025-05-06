import java.util.Arrays;
import java.util.Scanner;

public class att6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = {1,2,3,4,5,6,7,8,9,10};
        int r = s.nextInt();
        int[] novoVetor = new int[v.length - 1];
        int j = 0;
        for (int num : v) {
            if (num != r || j == novoVetor.length) {
                novoVetor[j] = num;
                j++;
            }
        }
        for (int num : novoVetor) {
            System.out.print(num + " ");
        }
        s.close();
    }
}
