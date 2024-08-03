// Palindrome of a string:
  
     public class PalindromeOfString {
    public static void main (String[]args){
        String OriginalStr="abba";
        System.out.println("nput string = "+OriginalStr);
        String ReversedStr="";
        for(int i=0;i<OriginalStr.length();i++){
            ReversedStr=OriginalStr.charAt(i)+ReversedStr;
        }
        if (OriginalStr.equals(ReversedStr)){
            System.out.println("Given string is palindrome");
        }
        
        else {
            System.out.println("Given string is not  palindrome");
            
        }
        System.out.println("Output string = "+ReversedStr);
    }

}
