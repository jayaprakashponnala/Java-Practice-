// Fibonacci Series : 

class FibonacciSeries{
    static void Fibonacci(int N){
    int num1=0,num2=1,num3;
    for(int i=1;i<N;i++){
       System.out.print(num1 + " " );
       num3 = num2+num1;
       num1=num2;
       num2=num3;
    }
}
public static void main(String args[]){
    int N=10;
    Fibonacci(10);
    
}
}
