/*
Given a String with white spaces, the task is to remove all white spaces from a string

Input:str = "     ha ha     !!   done by       hanumanth           ";
output:  haha!!donebyhanumanth





*/
public class MyClass {
    public static void main(String args[]) {
      
      String str = "     ha ha     !!   done by       hanumanth           ";

      System.out.println( removespaces(str) );
      System.out.println( "------Builtin fun------" );
      System.out.println( removespacesBUIltinfun(str) );
    }
    
    public static String removespaces(String s){
        String str="";
        for(int i=0;i<s.length() ;i++ ){
            if( s.charAt(i) != ' ' ){
                str+=s.charAt(i);
            }
        }
        return str;
    }
    
    public static String removespacesBUIltinfun(String s){
        String str = s.replaceAll("\\s", "");
        return str;
    }
    
}











