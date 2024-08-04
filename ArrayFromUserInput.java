 // Array  From User  Input

import java.util.*;
class ArrayFromUserInput {
    public static void main(String[] args) {
        int arr [] = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum=0;
        
        for(int i=0; i<arr.length;i++){
        System.out.print("Enter arr["+i+"] : ");
        arr[i]=sc.nextInt();
        }
        
        for(int i=0; i<arr.length;i++){
        System.out.print( arr[i]+" ");
         
        }
         
    }
}
