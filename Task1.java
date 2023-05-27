package project2;

public class Task1 {
    //Reverse a String: Write a function to reverse a given string. For
    //example, given the input "Hello", the output should be "olleH"

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello";
        String reversedString = reverseString(input);
        System.out.println(reversedString);
    }
}
