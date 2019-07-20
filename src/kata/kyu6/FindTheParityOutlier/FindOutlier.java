import java.util.*;
public class FindOutlier{
  static int find(int[] integers){
  
  List<Integer> evens = new ArrayList<Integer>();
  List<Integer> odds = new ArrayList<Integer>();
  
    for (int i : integers) {
    
      if (i % 2 == 0) {
        evens.add(i);
      } 
      else {
        odds.add(i);
      }
    }
    
    if (evens.size() == 1 && odds.size() != 1) {
    
      return evens.get(0);
    }
    
    if (evens.size() != 1 && odds.size() == 1) {
    
      return odds.get(0);
    }
    
    return 0;
  }
}