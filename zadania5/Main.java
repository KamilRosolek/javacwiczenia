import java.util.*;

public class Zajecia5 {

    // Zadanie 1 – silnia
    static long silniaIter(int n) {
        long wynik = 1;
        for (int i = 1; i <= n; i++) wynik *= i;
        return wynik;
    }

    static long silniaRek(int n) {
        if (n <= 1) return 1;
        return n * silniaRek(n - 1);
    }

    // Zadanie 2 – Fibonacci
    static long fibIter(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        long a = 1, b = 2;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static long fibRek(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        return fibRek(n - 1) + fibRek(n - 2);
    }

    // Zadanie 3 – strpos
    static int strpos(String text, char z) {
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == z) return i;
        return -1;
    }

    // Zadanie 4 – flipCase
    static String flipCase(String text) {
        String wynik = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) wynik += Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) wynik += Character.toUpperCase(c);
            else wynik += c;
        }
        return wynik;
    }

    // Zadanie 5 – startsWith
    static boolean startsWith(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (int i = 0; i < str2.length(); i++)
            if (str1.charAt(i) != str2.charAt(i)) return false;
        return true;
    }

    // Zadanie 6 – strToInt
    static int strToInt(String str) {
        if (str.isEmpty()) return 0;
        int i = 0, znak = 1, wynik = 0;
        if (str.charAt(0) == '+') i++;
        else if (str.charAt(0) == '-') {
            znak = -1;
            i++;
        }
        boolean e = false;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) wynik = wynik * 10 + (c - '0');
            else if (c == 'e' && !e) {
                e = true;
                i++;
                int exp = 0;
                boolean minus = false;
                if (i < str.length() && str.charAt(i) == '-') return wynik * znak; // e-
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    exp = exp * 10 + (str.charAt(i) - '0');
                    i++;
                }
                for (int j = 0; j < exp; j++) wynik *= 10;
                return wynik * znak;
            } else break;
            i++;
        }
        return wynik * znak;
    }

    // Zadanie 7 – strfind
    static int strfind(String gdzie, String co) {
        if (co.equals("")) return 0;
        for (int i = 0; i <= gdzie.length() - co.length(); i++) {
            int j = 0;
            while (j < co.length() && gdzie.charAt(i + j) == co.charAt(j)) j++;
            if (j == co.length()) return i;
        }
        return -1;
    }

    // Zadanie 8 – wordCount
    static int wordCount(String text) {
        int licznik = 0;
        boolean wSlow = false;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) wSlow = false;
            else if (!wSlow) {
                licznik++;
                wSlow = true;
            }
        }
        return licznik;
    }

    // Zadanie 9 – podzielNaSlowa
    static String[] podzielNaSlowa(String tekst) {
        tekst = tekst.trim();
        if (tekst.isEmpty()) return new String[0];
        ArrayList<String> slowa = new ArrayList<>();
        String slowo = "";
        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            if (Character.isWhitespace(c)) {
                if (!slowo.isEmpty()) {
                    slowa.add(slowo);
                    slowo = "";
                }
            } else slowo += c;
        }
        if (!slowo.isEmpty()) slowa.add(slowo);
        return slowa.toArray(new String[0]);
    }

    // Zadanie 10 – strFindAndCount
    static int strFindAndCount(String gdzie, String co) {
        if (co.equals("")) return 0;
        int licznik = 0;
        for (int i = 0; i <= gdzie.length() - co.length(); i++) {
            int j = 0;
            while (j < co.length() && gdzie.charAt(i + j) == co.charAt(j)) j++;
            if (j == co.length()) licznik++;
        }
        return licznik;
    }

    // Zadanie 11 – strcut
    static String strcut(String str, int start, int ile) {
        if (start >= str.length()) return str;
        if (start + ile >= str.length()) return str.substring(0, start);
        return str.substring(0, start) + str.substring(start + ile);
    }

    // Zadanie 13 – poprzestawiaj
    static String poprzestawiaj(String tekst, int[] kol) {
        char[] wynik = new char[tekst.length()];
        for (int i = 0; i < tekst.length(); i++)
            if (kol[i] < tekst.length()) wynik[kol[i]] = tekst.charAt(i);
        return new String(wynik);
    }

    // Zadanie 14 – czyAnagram
    static boolean czyAnagram(String t1, String t2) {
        int[] licz1 = new int[26];
        int[] licz2 = new int[26];
        for (char c : t1.toLowerCase().toCharArray())
            if (c >= 'a' && c <= 'z') licz1[c - 'a']++;
        for (char c : t2.toLowerCase().toCharArray())
            if (c >= 'a' && c <= 'z') licz2[c - 'a']++;
        return Arrays.equals(licz1, licz2);
    }

    // Zadanie 15 – HTMLColor2RGB
    static int[] HTMLColor2RGB(String color) {
        int[] rgb = new int[3];
        rgb[0] = Integer.parseInt(color.substring(1, 3), 16);
        rgb[1] = Integer.parseInt(color.substring(3, 5), 16);
        rgb[2] = Integer.parseInt(color.substring(5, 7), 16);
        return rgb;
    }

    public static void main(String[] args) {
        // Test kilku przykładów
        System.out.println(silniaIter(5));
        System.out.println(silniaRek(5));
        System.out.println(fibIter(5));
        System.out.println(fibRek(5));
        System.out.println(strpos("Ala", 'l'));
        System.out.println(flipCase("Ala Ma KOTA"));
        System.out.println(startsWith("Alibaba", "Ali"));
        System.out.println(strToInt("-12e5"));
        System.out.println(strfind("Ala ma kota", "ma"));
        System.out.println(wordCount("Ala ma kota i psa"));
        System.out.println(Arrays.toString(podzielNaSlowa("Ala ma kota")));
        System.out.println(strFindAndCount("mama ma kota", "ma"));
        System.out.println(strcut("Ala ma kota", 4, 3));
        System.out.println(poprzestawiaj("Egzamin", new int[]{0,1,4,3,2,6,5}));
        System.out.println(czyAnagram("kolej", "olejk"));
        System.out.println(Arrays.toString(HTMLColor2RGB("#FF0050")));
    }
}
