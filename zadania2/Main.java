import java.util.Scanner;
import java.util.Random;

public class Zajecia2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Zadanie 1
        System.out.println("Zadanie 1 - liczby nieparzyste do n");
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Zadanie 2
        System.out.println("Zadanie 2 - suma od A do B (3 pętle)");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int suma = 0, i;

        i = A; suma = 0;
        while (i <= B) { suma += i; i++; }
        System.out.println(suma);

        i = A; suma = 0;
        do { suma += i; i++; } while (i <= B);
        System.out.println(suma);

        suma = 0;
        for (i = A; i <= B; i++) { suma += i; }
        System.out.println(suma);

        // Zadanie 3
        System.out.println("Zadanie 3 - potęgi 2 do n");
        int n3 = sc.nextInt();
        int p = 1;
        while (p <= n3) {
            System.out.println(p);
            p *= 2;
        }

        // Zadanie 4
        System.out.println("Zadanie 4 - suma aż do 0");
        int suma4 = 0;
        int x;
        do {
            x = sc.nextInt();
            suma4 += x;
        } while (x != 0);
        System.out.println("Suma = " + suma4);

        // Zadanie 5
        System.out.println("Zadanie 5 - min, max, suma i średnia");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, y;
        do {
            y = sc.nextInt();
            if (y != 0) {
                if (y < min) min = y;
                if (y > max) max = y;
            }
        } while (y != 0);
        int sumaMinMax = min + max;
        double srednia = (min + max) / 2.0;
        System.out.println("Suma min i max: " + sumaMinMax);
        System.out.println("Średnia: " + srednia);

        // Zadanie 6
        System.out.println("Zadanie 6 - Gra za dużo, za mało");
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int guess;
        do {
            guess = sc.nextInt();
            if (guess > secret) System.out.println("Za dużo");
            else if (guess < secret) System.out.println("Za mało");
        } while (guess != secret);
        System.out.println("Gratulacje!");

        // Zadanie 7
        System.out.println("Zadanie 7 - prostokąt");
        char znak = sc.next().charAt(0);
        int xPos = sc.nextInt();
        int yPos = sc.nextInt();
        int a = sc.nextInt(); // wys
        int b = sc.nextInt(); // szer
        for (int y2 = 1; y2 < yPos; y2++) System.out.println();
        for (int i2 = 0; i2 < a; i2++) {
            for (int sp = 1; sp < xPos; sp++) System.out.print(" ");
            for (int j2 = 0; j2 < b; j2++) System.out.print(znak);
            System.out.println();
        }

        // Zadanie 8
        System.out.println("Zadanie 8 - choinka");
        int h = sc.nextInt();
        for (int r = 1; r <= h; r++) {
            for (int j2 = 1; j2 <= 2*r-1; j2++) System.out.print("*");
            System.out.println();
        }

        // Zadanie 9
        System.out.println("Zadanie 9 - suma cyfr i stosunek średnich");
        int num = sc.nextInt();
        int suma9 = 0, parz = 0, nieparz = 0, cParz = 0, cNie = 0;
        int tmp = Math.abs(num);
        while (tmp > 0) {
            int d = tmp % 10;
            suma9 += d;
            if (d % 2 == 0) { parz += d; cParz++; }
            else { nieparz += d; cNie++; }
            tmp /= 10;
        }
        System.out.println("Suma cyfr: " + suma9);
        if (cParz > 0 && cNie > 0) {
            double srParz = (double)parz / cParz;
            double srNie = (double)nieparz / cNie;
            System.out.println("Stosunek: " + (srParz/srNie));
        }

        // Zadanie 10
        System.out.println("Zadanie 10 - dzielniki liczby");
        int n10 = sc.nextInt();
        for (int d = 1; d <= n10; d++) {
            if (n10 % d == 0) System.out.print(d + " ");
        }
        System.out.println();

        // Zadanie 11
        System.out.println("Zadanie 11 - liczba pierwsza?");
        int n11 = sc.nextInt();
        boolean pierwsza = true;
        if (n11 <= 1) pierwsza = false;
        else {
            for (int d = 2; d*d <= n11; d++) {
                if (n11 % d == 0) { pierwsza = false; break; }
            }
        }
        if (pierwsza) System.out.println("TAK");
        else System.out.println("NIE");
    }
}
