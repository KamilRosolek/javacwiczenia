import java.util.Random;
import java.util.Scanner;

public class Zajecia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Zadanie 1
        System.out.println("Zadanie 1");
        int[] t1 = new int[10];
        for (int i = 0; i < t1.length; i++) t1[i] = rand.nextInt(21) - 10;
        for (int x : t1) System.out.print(x + " ");
        System.out.println();
        int min = t1[0], max = t1[0]; double suma = 0;
        for (int x : t1) {
            if (x < min) min = x;
            if (x > max) max = x;
            suma += x;
        }
        double sr = suma / t1.length;
        int mniejsz = 0, wieksz = 0;
        for (int x : t1) {
            if (x < sr) mniejsz++;
            else if (x > sr) wieksz++;
        }
        System.out.println("Min: " + min + ", max: " + max);
        System.out.printf("Średnia: %.2f%n", sr);
        System.out.println("Mniejszych: " + mniejsz);
        System.out.println("Większych: " + wieksz);
        System.out.println("Odwrotnie:");
        for (int i = t1.length - 1; i >= 0; i--) System.out.print(t1[i] + " ");
        System.out.println();

        // Zadanie 2
        System.out.println("\nZadanie 2");
        int[] t2 = new int[20];
        int[] licz = new int[11];
        for (int i = 0; i < t2.length; i++) {
            t2[i] = rand.nextInt(10) + 1;
            licz[t2[i]]++;
            System.out.print(t2[i] + " ");
        }
        System.out.println("\nWystąpienia:");
        for (int i = 1; i <= 10; i++)
            System.out.println(i + " - " + licz[i]);

        // Zadanie 3
        System.out.println("\nZadanie 3");
        int[][] t3 = new int[5][5];
        int[] minKol = new int[5];
        int[] maxKol = new int[5];
        for (int j = 0; j < 5; j++) { minKol[j] = 6; maxKol[j] = -6; }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                t3[i][j] = rand.nextInt(11) - 5;
                System.out.printf("%3d", t3[i][j]);
                if (t3[i][j] < minKol[j]) minKol[j] = t3[i][j];
                if (t3[i][j] > maxKol[j]) maxKol[j] = t3[i][j];
            }
            System.out.println();
        }
        System.out.print("Min: ");
        for (int x : minKol) System.out.printf("%3d", x);
        System.out.print("\nMax: ");
        for (int x : maxKol) System.out.printf("%3d", x);
        System.out.println();

        // Zadanie 4
        System.out.println("\nZadanie 4 - kod binarny ZM");
        int n = sc.nextInt();
        int[] bity = new int[32];
        boolean neg = n < 0;
        int val = Math.abs(n);
        int i = 31;
        while (val > 0 && i >= 0) {
            bity[i] = val % 2;
            val /= 2;
            i--;
        }
        System.out.print("Liczba " + n + " binarnie: ");
        if (neg) System.out.print("1.");
        for (int j = i + 1; j < 32; j++) System.out.print(bity[j]);
        System.out.println();

        // Zadanie 5 (ZU1, ZU2)
        System.out.println("\nZadanie 5 - ZU1, ZU2");
        int[] zu1 = new int[32];
        int[] zu2 = new int[32];
        for (int j = 0; j < 32; j++) zu1[j] = (bity[j] == 0) ? 1 : 0;
        int carry = 1;
        for (int j = 31; j >= 0; j--) {
            int sum = zu1[j] + carry;
            zu2[j] = sum % 2;
            carry = sum / 2;
        }
        System.out.print("ZU1: ");
        for (int j = i + 1; j < 32; j++) System.out.print(zu1[j]);
        System.out.print("\nZU2: ");
        for (int j = i + 1; j < 32; j++) System.out.print(zu2[j]);
        System.out.println();

        // Zadanie 9
        System.out.println("\nZadanie 9 - tablica n x n z względnie pierwszymi");
        int n9 = sc.nextInt();
        boolean[][] t9 = new boolean[n9][n9];
        for (int a = 0; a < n9; a++) {
            for (int b = 0; b < n9; b++) {
                t9[a][b] = gcd(a + 1, b + 1) == 1;
                System.out.print(t9[a][b] ? "+" : ".");
            }
            System.out.println();
        }
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
