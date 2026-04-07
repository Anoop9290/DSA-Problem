import java.util.Scanner;

public class palindrome {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();
        int temp=number;
        int rev=0;
        
        isPalindrome(number, temp, rev);

    }

    private static void isPalindrome(int number, int temp, int rev) {
        while(temp>0){


            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;


        }
        if(rev==number){
            System.out.print("Number is Palindrome");
        }
    }
}