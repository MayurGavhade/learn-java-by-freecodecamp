import java.util.Scanner;

class Palindrome {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number to check if it is palindrome: ");
         boolean isPalindrome = isPalindrome(input.nextInt());
         if (isPalindrome) {
             System.out.println("The given number is palindrome");
         } else {
             System.out.println("The given number is not palindrome");
         }
     }

     public static boolean isPalindrome(int num) {
         return num == reverse(num);
     }

     public static int reverse(int num) {
         int newNum = 0;
         while(num > 0) {
             int digit = num % 10;
             newNum = newNum * 10 + digit;
             num /= 10;
         }
         return newNum;
     }
 }