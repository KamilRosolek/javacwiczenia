import java.util.Scanner;

public class Zajecia4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Zadanie 1
        System.out.println("Zadanie 1 - ile razy występuje ostatni znak");
        String tekst1 = sc.nextLine();
        char ostatni = tekst1.charAt(tekst1.length() - 1);
        int licznik = 0;
        for (int i = 0; i < tekst1.length(); i++) {
            if (tekst1.charAt(i) == ostatni) licznik++;
        }
        System.out.println("Ostatni znak '" + ostatni + "' występuje " + licznik + " razy.");

        // Zadanie 2
        System.out.println("\nZadanie 2 - odwrócony tekst");
        String tekst2 = sc.nextLine();
        String odwrocony = "";
        for (int i = tekst2.length() - 1; i >= 0; i--) {
            odwrocony += tekst2.charAt(i);
        }
        System.out.println("Odwrócony: " + odwrocony);

        // Zadanie 3
        System.out.println("\nZadanie 3 - palindrom?");
        String tekst3 = sc.nextLine();
        String odwrocony3 = "";
        for (int i = tekst3.length() - 1; i >= 0; i--) odwrocony3 += tekst3.charAt(i);
        if (tekst3.equalsIgnoreCase(odwrocony3))
            System.out.println("To jest palindrom.");
        else
            System.out.println("To nie jest palindrom.");

        // Zadanie 4
        System.out.println("\nZadanie 4 - suma cyfr w tekście");
        String tekst4 = sc.nextLine();
        int suma = 0;
        for (int i = 0; i < tekst4.length(); i++) {
            char c = tekst4.charAt(i);
            if (Character.isDigit(c)) suma += Character.getNumericValue(c);
        }
        System.out.println("Suma cyfr: " + suma);

        // Zadanie 5
        System.out.println("\nZadanie 5 - sprawdzanie nawiasów");
        String wyrazenie = sc.nextLine();
        int licznikNawias = 0;
        boolean blad = false;
        for (int i = 0; i < wyrazenie.length(); i++) {
            char c = wyrazenie.charAt(i);
            if (c == '(') licznikNawias++;
            else if (c == ')') {
                licznikNawias--;
                if (licznikNawias < 0) blad = true;
            }
        }
        if (blad || licznikNawias != 0)
            System.out.println("Błędne sparowanie nawiasów");
        else
            System.out.println("OK");

        // Zadanie 6
        System.out.println("\nZadanie 6 - szyfr Cezara");
        System.out.print("Podaj tekst: ");
        String tekst6 = sc.nextLine();
        System.out.print("Podaj przesunięcie: ");
        int przes = sc.nextInt();
        String wynik = "";
        for (int i = 0; i < tekst6.length(); i++) {
            char c = tekst6.charAt(i);
            if (c == ' ') wynik += ' ';
            else {
                int kod = c - 'a';
                kod = (kod + przes) % 26;
                if (kod < 0) kod += 26;
                wynik += (char)('a' + kod);
            }
        }
        System.out.println("Zaszyfrowany tekst: " + wynik);
    }
}
