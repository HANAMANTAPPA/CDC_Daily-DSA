
/*Check whether a String is Palindrome or not

Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome

*/


public class Plindrome {
    public static void main(String args[]) {
     

      System.out.println(plindrome ("xyxyy") );
    }
    
    public static boolean plindrome(String s){
        //boolean b= true;
        String rs="";
        for(int i=s.length()-1; i>=0; i--){
            rs=rs+ s.charAt(i);
        }
        
        System.out.println(rs);
        
        for (int i=0; i<s.length(); i++){
            if ( s.charAt(i) != rs.charAt(i) ){
                return false;
            }
        }
        
        return true;
        
    }
}


