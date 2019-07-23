import java.util.*;
public class Kata {
  public static String createPhoneNumber(int[] numbers) {
  
  StringBuilder sb = new StringBuilder();
  
    for (int i = 0; i < numbers.length; i++) {
    
      sb.append(numbers[i]);
    }
    
    String str = sb.toString();
    
    String s1 = str.substring(0,3);
    
    String s2 = str.substring(3,6);
    
    String s3 = str.substring(6);
    
    return String.format("(%1$s) %2$s-%3$s", s1, s2, s3);
  }
}
