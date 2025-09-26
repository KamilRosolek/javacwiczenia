import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        double Celsius, Fahrenheit;
        Scanner degreeAsk = new Scanner(System.in);
        System.out.println("Wpisz liczbę w stopniach Celsiusza: ");
        Celsius = degreeAsk.nextDouble();
        Fahrenheit = 1.8 * Celsius + 32;
        System.out.println("Równa się to tyle stopni Fahrenheita: " + Fahrenheit);

        // Zadanie 2
        int[] numbers = new int[3];
        Scanner numberSort = new Scanner(System.in);
        System.out.println("Wpisz trzy liczby całkowite");
        numbers[0] = numberSort.nextInt();
        numbers[1] = numberSort.nextInt();
        numbers[2] = numberSort.nextInt();
        Arrays.sort(numbers);
        System.out.println("Największa: " + numbers[2] + " Najmniejsza: " + numbers[0]);

        // Zadanie 3
        double[] bmiData = new double[3];
        String result;
        Scanner bmi = new Scanner(System.in);
        System.out.println("Wpisz swoją wagę (w kg) oraz wzrost (w metrach):");
        bmiData[0] = bmi.nextDouble();
        bmiData[1] = bmi.nextDouble();
        bmiData[2] = bmiData[0] / (bmiData[1] * bmiData[1]);
        if (bmiData[2] < 18.5) {
            result = " - Niedowaga.";
        } else if (bmiData[2] >= 18.5 && bmiData[2] <= 24.9) {
            result = " - Waga prawidłowa.";
        } else {
            result = " - Nadwaga.";
    }
        System.out.println("BMI wynosi: " + bmiData[2] + result);

        // Zadanie 4
        double income, tax;
        Scanner netIncome = new Scanner(System.in);
        System.out.println("Wpisz swój dochód (w zł): ");
        income = netIncome.nextDouble();
        if (income <= 85528) {
            tax = 0.18 * income - 556.02;
        } else {
            tax = 0.32 * (income - 85528) + 14839.02;
        }
        System.out.println("Twój podatek wynosi: " + tax + " zł.");

        // Zadanie 5
        double cena, rata;
        int liczbaRat;
        Scanner kalkRat = new Scanner(System.in);
        System.out.println("Wpisz cenę zakupu (100 zł - 1k zł) oraz liczbę rat (od 6 do 48): ");
        cena = kalkRat.nextDouble();
        liczbaRat = kalkRat.nextInt();
        if (cena <= 100 || cena >= 10000 || liczbaRat < 6 || liczbaRat > 48 ) {
            System.out.println("Błędne dane. Wpisz dane ponownie zgodnie z zakresem.");
        } else if (liczbaRat <= 12) {
            rata = (cena / liczbaRat);
            rata += 0.025 * rata;
            System.out.println("Miesięczna rata wynosi: " + rata + " zł.");
        } else if (liczbaRat <= 24){
            rata = (cena / liczbaRat);
            rata += 0.05 * rata;
            System.out.println("Miesięczna rata wynosi: " + rata + " zł.");
        } else {
            rata = (cena / liczbaRat);
            rata += 0.1 * rata;
            System.out.println("Miesięczna rata wynosi: " + rata + " zł.");
        }

    }

}