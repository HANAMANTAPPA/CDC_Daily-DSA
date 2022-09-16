/* Reverse the given String */

public class MyClass {
    public static void main(String args[]) {
      String str="Hello world";

      System.out.println(ReverseSting(str) );
    }
    
    public static String ReverseSting(String s){
        String temp="";
        
        for (int i=s.length()-1 ; i>=0; i--){
            temp=temp+s.charAt(i);
        }
        return temp;
    }
}
