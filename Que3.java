package Assignment7;

import java.util.Scanner;

public class Que3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();

        try {
            checkForVowels(str);
            System.out.println("string contains vowels");
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForVowels(String str) throws NoVowelException {
        boolean hasVowel = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                hasVowel = true;
                break;
            }
        }

        if (!hasVowel) {
            throw new NoVowelException("string does not contain vowels");
        }
    }
}

class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}