import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double degreesF;

        System.out.println("Enter degrees in fahrenheit: ");
        Scanner numberInput = new Scanner(System.in);
        degreesF = Double.parseDouble(numberInput.nextLine());

        double finalNum = ((degreesF - 32)*5)/9 ;

        System.out.println("Degrees in fahrenheit: " + degreesF);
        System.out.println("Degrees in celsius: " + finalNum);
    }
}
