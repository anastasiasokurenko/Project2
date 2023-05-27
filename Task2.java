package project2;

public class Task2 {
    //Check if a String is Palindrome: Determine whether a given string is
    //a palindrome, which means it reads the same forwards and
    //backward. For example, "madam" is a palindrome.
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is palindrome? " + isPalindrome);
    }
}
