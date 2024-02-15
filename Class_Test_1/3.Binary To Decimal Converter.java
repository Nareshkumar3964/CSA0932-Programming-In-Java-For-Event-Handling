import java.util.Scanner;

public class BinaryToDecimalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        int decimalNumber = binaryToDecimal(binaryNumber);

        System.out.println("Decimal equivalent: " + decimalNumber);

        scanner.close();
    }

    public static int binaryToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int power = 0;

        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(binaryNumber.charAt(i));

           
            decimalNumber += digit * Math.pow(2, power);

            power++;
        }

        return decimalNumber;
    }
}
