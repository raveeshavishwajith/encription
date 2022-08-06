import java.util.Scanner;

public class encrypt {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1.For Encryption \n2.For Decryption : ");
        int num = inp.nextInt();
        inp.nextLine();
        int addsub = 10;
        String convertedChar = "";

        // Encryption

        if (num == 1) {
            System.out.print("Enter keyword to encrypt : ");
            String keyword = inp.nextLine();
            for (int i = 0; i < keyword.length(); i++) {
                int b = keyword.charAt(i) + i + addsub;
                if (b <= 126 && b >= 32) {
                    convertedChar += Character.toString(b);
                } else if (b >= 126) {
                    b = b - 126 + 32;
                    convertedChar += Character.toString(b);
                } else {
                    b = b + 32;
                    convertedChar += Character.toString(b);
                }
            }
            System.out.println("Your cipher text is : " + convertedChar);
        }

        // Decryption

        else if (num == 2) {
            System.out.print("Enter keyword to decrypt : ");
            String keyword = inp.nextLine();
            for (int i = 0; i < keyword.length(); i++) {
                int b = keyword.charAt(i) - i - addsub;
                if (b <= 126 && b >= 32) {
                    convertedChar += Character.toString(b);
                } else if (b >= 126) {
                    b = b - 32;
                    convertedChar += Character.toString(b);
                } else {
                    b = b + 126 - 32;
                    convertedChar += Character.toString(b);
                }
            }
            System.out.print("Your original text is : " + convertedChar);
        }

        // Exit when input another number

        else {
            System.out.println("Your entered wrong number");
            System.exit(0);
        }
    }
}
