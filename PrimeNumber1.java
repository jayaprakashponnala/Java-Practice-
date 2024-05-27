//  Prime Number :  

public class PrimeNumber1{
    public static void main(String[] args) {
        int i, count = 0, numb = 5;
        for (i = 1; i <= numb; i++) {
            if (numb % i == 0) {
                count++;
            }
        }
        System.out.println("enterd numberis ")
        if (count == 2) {
            System.out.println(numb + " is Prime");
        } else {
            System.out.println(numb + " is not Prime");
        }
    }

}
