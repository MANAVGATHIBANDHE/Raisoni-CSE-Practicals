import java.util.Scanner;

/**
 * practical_no_1
 */
public class practical_no_1 {
    public static void main(String[] args) {

        // To demonstrate Classical Cipher.

        // Get the User Message
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Message : ");
        String plainText = scan.nextLine();

        // Converting into ASCII Value
        char[] cipherText = new char[plainText.length()];
        int[] asciiText = new int[cipherText.length];
        String[] binaryBit = new String[asciiText.length];

        // Swapping
        String[] Swap_bit = new String[binaryBit.length];

        // Converting Bits into Hexa-Decimal
        String[] hexa_decimal = new String[Swap_bit.length];

        for (int i = 0; i < plainText.length(); i++) {
            cipherText[i] = plainText.charAt(i);
            asciiText[i] = (int) cipherText[i];
            // ASCII Convert into 7 Digit Binary
            binaryBit[i] = String.format("%7s", Integer.toBinaryString(asciiText[i])).replace(' ', '0');
            Swap_bit[i] = binaryBit[i].substring(3, 7).concat(binaryBit[i].substring(0, 3));
            // Convert binary to integer
            int decimal = Integer.parseInt(Swap_bit[i], 2);
            // Convert integer to hexadecimal
            hexa_decimal[i] = Integer.toHexString(decimal);
        }
        System.out.println("Plain Text" + "\t" + "ASCII Value" + "\t" + "7 Binary Digit" + "\t" + "Swap Binary" + "\t"
                + "Hexa-Decimal");
        for (int i = 0; i < plainText.length(); i++) {
            System.out.println(
                    cipherText[i] + "\t\t" + asciiText[i] + "\t\t" + binaryBit[i] + "\t\t" + Swap_bit[i] + "\t\t"
                            + hexa_decimal[i]);
        }
    }
}
