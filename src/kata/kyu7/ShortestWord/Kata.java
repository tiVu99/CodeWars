import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        
        String[] arr = s.split(" ");
        
        int min = arr[0].length();
        
          for (int i = 0; i < arr.length; i++) {
        
            if (arr[i].length() < min) {
          
              min = arr[i].length();
            }
          }
        
        return min;
    }
}