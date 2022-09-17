/*
# Q1 The Converter (Roman to Integer)

—> Roman numerals are represented by seven different symbols:  I ,  V ,  X ,  L ,  C ,  D and  M .
—> For example,  2  is written as  II  in Roman numeral, just two ones added together.  12  is
  written as  XII , which is simply  X + II . The number  27  is written as  XXVII , which
  is  XX + V + II .
—>Roman numerals are usually written largest to smallest from left to right. However, the
  numeral for four is not  IIII . Instead, the number four is written as  IV . Because the one
  is before the five we subtract it making four. The same principle applies to the number
  nine, which is written as  IX . There are six instances where subtraction is used:
—>I  can be placed before  V  (5) and  X  (10) to make 4 and 9.
—>X  can be placed before  L  (50) and  C  (100) to make 40 and 90.
—>C  can be placed before  D  (500) and  M  (1000) to make 400 and 900.
—>Given a roman numeral, convert it to an integer.

Symbol: I V  X   L   C   D   M
Value:  1 5 10  50  100 500 1000

*/
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      String roman1="XXVII";      //------- input -----27
      String roman2="MM";         //------- input -----2000
      String roman3="CMXCIX";     //------- input -----999
      String roman4="XLIV";       //------- input -----44

      System.out.println( romanToInt(roman1) );
      System.out.println( romanToInt(roman2) );
      System.out.println( romanToInt(roman3) );
      System.out.println( romanToInt(roman4) );
    }
    
    public static int romanToInt(String st){
        Map<Character, Integer> map1=new HashMap<>();
        
        map1.put('I', 1);
        map1.put('V', 5);
        map1.put('X', 10);
        map1.put('L', 50);
        map1.put('C', 100);
        map1.put('D', 500);
        map1.put('M', 1000);
        
        int len=st.length();
        int num= map1.get( st.charAt(len-1) ); // get the last char valve
        
        for(int i=len-2; i>=0;i--){
            
            if ( map1.get( st.charAt(i)) >= map1.get( st.charAt(i+1)) ) {
                // just add the number 
                num=num + map1.get( st.charAt(i));
            }else{ // left char value is greater than right char value  
                num=num - map1.get( st.charAt(i));
            }
        }
        
        return num;
    }
}
/* OUTPUT
27
2000
999
44      */
