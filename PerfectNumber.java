// PerfectNumber:

 
import java.util.*;
class PerfectNumber{
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        if(sum==number){
            System.out.print("is a Perfect  Number : ");
        }
        else{
            System.out.print( "is not a Perfect Number : ");
        }
    }
}
