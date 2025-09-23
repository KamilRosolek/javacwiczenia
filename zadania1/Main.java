import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        double Celsius, Fahrenheit;
        Scanner degreeAsk = new Scanner(System.in);
        System.out.println("Wpisz liczbę w stopniach Celsiusza: ")
        Celsius = degreeAsk.nextDouble();
        Fahrenheit = 1.8 * Celsius + 32;
        System.out.println("Równa się to tyle stopni Fahrenheita: ");
        // Zadanie 2
        int[] numbers = new int[3];
        Scanner numberSort = new Scanner(System.in);
        System.out.println("Wpisz trzy liczby całkowite");
        numbers[0] = numberSort.nextInt();
        numbers[1] = numberSort.nextInt();
        numbers[2] = numberSort.nextInt();
    }

}