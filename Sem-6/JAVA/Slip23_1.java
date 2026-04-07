import java.util.Scanner;

public class Slip23_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Vowels in the string (every 3 seconds):");

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);

                try {
                    Thread.sleep(3000); // 3 seconds delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        sc.close();
    }
}