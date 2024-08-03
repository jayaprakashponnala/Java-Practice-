// Prime number within a range :

public class PrimeNumberRange{
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
             
        }
        return true;
    }
    
    public static void main (String args[]){
        int start =2 , end =100;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}



 
