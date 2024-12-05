package StringHandling;//level

import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        String str = "level"; // String for testing

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();

        if (str.equals(str1.toString())) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a palindrome String");
        }
    }
}