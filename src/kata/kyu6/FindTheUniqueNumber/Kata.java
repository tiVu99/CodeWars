import java.util.*;
 public class Kata {
    public static double findUniq(double arr[]) {
     
      Map<Double, Integer> map = new HashMap<>(arr.length);
      
      for (Double num : arr) {
      
        Integer occur = map.get(num);
        
        map.put(num, occur == null ? 1 : occur + 1);
      
      }
      
      for (Map.Entry<Double, Integer> uniq : map.entrySet()) {
      
        if (uniq.getValue() == 1) {
        
          return uniq.getKey();
        
        }
      
      }
      
      return arr[0];
    }
}