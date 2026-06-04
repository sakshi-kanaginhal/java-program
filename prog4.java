import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = sc.nextLine();

        int characters = text.length();

        int words = 0;
        if (!text.trim().isEmpty()) {
            words = text.trim().split("\\s+").length;
        }

        int lines = 1; // Single line input

        System.out.println("Number of Characters: " + characters);
        System.out.println("Number of Words: " + words);
        System.out.println("Number of Lines: " + lines);

        sc.close();
    }
}