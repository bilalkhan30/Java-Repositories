// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number you want to reverse: ");
        int number = sc.nextInt();
        
        int result = Reverse(number);
        System.out.println("\nThe reverse number is: "+result);
        
        if(IsPalindrome(number))
        {
            System.out.println("\nThe number is Palindrome:");
        }
        else
        {
            System.out.println("\nThe number is not Palindrome:");
        }
    }
    
    public static int Reverse( int number)
    
    {
        int reverse = 0;
        int remain = 0;
        while( number != 0 )
        {
            remain = number %10;
            reverse = reverse * 10 + remain;
            number/= 10;
        }
        return reverse;
    }
    
    public static boolean IsPalindrome(int number)
    {
        int reverse = 0;
        int remain = 0;
        int Original_number = number;
        while( number != 0 )
        {
            remain = number %10;
            reverse = reverse * 10 + remain;
            number/= 10;
        }
        return Original_number == reverse;
    }
}