// Palindrome:  

    import java.util.*;
    public class PalindromeOfNumber{

    public static void main(String[] args) {
        int rev=0,temp=0,n=0;
        System.out.print("Enter number : " );
        Scanner sc =new Scanner(System.in);
        int numb=sc.nextInt();
         
        
        temp=numb;
        while(temp!=0){
            n=temp%10;
            rev=rev*10+n;
            temp=temp/10;
        }
        if(numb==rev){
            System.out.println(numb +" "+ " is palindrome");
        }
        else
            System.out.println(numb+" "+"is not palindrome");

        }
  }

