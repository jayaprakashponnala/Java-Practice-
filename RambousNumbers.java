 class RambousNumbers  {
    public static void main(String[] args) {
        int a=5;
        for(int i=1;i<=6;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" "); 
            }
            for(int k=1;k<=i;k++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
        for (int i = 1; i<=5; i++) {
             for (int j = 0; j<=i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >=i; k--) {
                
                System.out.print(a+" ");
            }
            System.out.println();
            a--;
            
        }
    }
}
