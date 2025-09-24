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
    }

}