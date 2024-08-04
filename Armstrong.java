// Armstrong Number :

 
import java.util.*;
class  Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int sum=0,rem=0,temp=0;
        temp=number;
        while(number!=0){
            rem=number%10;
            sum=sum+(rem*rem*rem*rem);
            number=number/10;
        }
        if(temp==sum){
            System.out.print("is a Armstrong  Number : ");
        }
        else{
            System.out.print( "is not a Armstrong Number : ");
        }
    }
}
