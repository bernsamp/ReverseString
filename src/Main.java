import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please write a word to be reversed:");

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringBuilder reversedString = new StringBuilder();

        for(int i = 0; i<string.length(); i++){
            char ch = string.charAt(i);
           reversedString.insert(0, ch);
        }
        System.out.println("The result is: " + reversedString);
    }
}