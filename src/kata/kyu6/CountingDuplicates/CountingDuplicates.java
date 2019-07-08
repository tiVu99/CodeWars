import java.util.*;
public class CountingDuplicates {
  public static int duplicateCount(String text) {
  
  int count = 0;
  
    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
    
      char[] arr = text.toLowerCase().toCharArray();
        
        for (Character c : arr) {
        
          if (map.containsKey(c)) {  
              map.put(c, map.get(c) + 1);  
          } 
            
          else { 
                map.put(c, 1);  
          }  
        } 
        
        Set<Character> keys = map.keySet();
        
        for (Character c : keys) {  
            if (map.get(c) > 1) {  
                count++;  
            }  
        } 
        
        return count;
  }
}