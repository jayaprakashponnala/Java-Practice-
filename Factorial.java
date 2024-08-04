 // Factorial : 


import java.util.*;
class Factorial{
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.print("Factorial of "+number+" is = "+ fact);
         
    }
}