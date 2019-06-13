package kata.kyu8.StringRepeat;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
    
      StringBuilder builder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
          builder.append(string);
        }
        
      return builder.toString();
    }
}
