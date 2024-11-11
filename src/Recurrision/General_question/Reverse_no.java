package Recurrision.General_question;

public class Reverse_no {
    public static void main(String[] args) {
        int number = 1234;
        int reversedNumber = reverse(number, 0);
        System.out.println("Reversed number: " + reversedNumber);
        if (number==reversedNumber){
            System.out.println("It is palindrome no");
        }else {
            System.out.println("It is not palindrome no");
        }
    }

    // Recursive function to reverse the number
    public static int reverse(int number, int reversed) {
        if (number == 0) {
            return reversed;
        }
        int remainder = number % 10;  // Get the last digit
        reversed = reversed * 10 + remainder;// Build the reversed number
        return reverse(number / 10, reversed); // Recursive call with remaining number
    }
}
