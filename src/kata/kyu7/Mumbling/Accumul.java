import java.util.*;
public class Accumul {
    
    public static String accum(String s) {
  
      char[] arr = s.toCharArray();
      
      String[] s1 = new String[arr.length];
      
      StringBuilder sb = new StringBuilder();
      
      for (int i = 0; i < arr.length; i++) {
      
        arr[i] = Character.toUpperCase(arr[i]);
        
        s1[i] = Character.toString(arr[i]);
        
        arr[i] = Character.toLowerCase(arr[i]);
        
        s1[i] += Character.toString(arr[i]).repeat(i);
      
      }
      
      for (int i = 0; i < s1.length-1; i++) {
        
        s1[i] += "-";
        
      }
      
      for (String w : s1) {

        sb.append(w);
      }
       
      return sb.toString();
    }
}