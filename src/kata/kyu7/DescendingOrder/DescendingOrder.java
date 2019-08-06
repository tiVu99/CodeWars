import java.util.*;
public class DescendingOrder {
  public static int sortDesc(final int num) {
  
  StringBuilder sb = new StringBuilder();
  
  String[] arr = String.valueOf(num).split("");
  
  Integer numArr[] = new Integer[arr.length];
  
    for (int i = 0; i < arr.length; i++) {
  
      numArr[i] = Integer.valueOf(arr[i]);
    }
  
  Arrays.sort(numArr, Collections.reverseOrder());
  
  for (Integer n : numArr) {
  
    sb.append(n);
  }
  
  return Integer.valueOf(sb.toString());
  }
}