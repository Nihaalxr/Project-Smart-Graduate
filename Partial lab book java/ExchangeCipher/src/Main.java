import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            String inStr;
        StringBuilder cipheredText = new StringBuilder();
        Scanner in = new Scanner(System.in);

            System.out.print("Enter a plaintext string: ");
            inStr = in.next().toUpperCase();

            for (int chIndex = 0; chIndex < inStr.length(); chIndex++) {
                char ch = inStr.charAt(chIndex);
                ch = (char)('A' + 'Z' - ch);
                cipheredText.append(ch);
            }

            System.out.println("The ciphertext string is: " + cipheredText);
        }
    }