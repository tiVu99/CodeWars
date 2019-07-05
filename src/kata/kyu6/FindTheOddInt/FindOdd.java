import java.util.*;
public class FindOdd {
	public static int findIt(int[] a) {
  
   int count = 0;
    
   int num = 0;
  
   List<Integer> list = new ArrayList<>(a.length);

		for (int i : a) {
			list.add(Integer.valueOf(i));
		}
    
		for (Integer n : list) {
      
      count = Collections.frequency(list, n);
      
      if (count % 2 != 0) {
      
        num = n;  
      }
		}
  	return num;
  }
}