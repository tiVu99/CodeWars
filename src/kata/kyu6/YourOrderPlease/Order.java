import java.util.ArrayList;
public class Order {
  public static String order(String words) {
    
    // Check empty string.
    if (words.isEmpty()) return "";
    
      String[] arr = words.split(" ");
      
        ArrayList order = new ArrayList<String>(words.length());

        for (int i = 0; i < arr.length + 1; i++) {
            order.add(i, " ");
        }

        for (String word : arr) {
            String pos = word.replaceAll("[^0-9]+", "");
            order.set(Integer.valueOf(pos), word);
        }
        
        order.remove(0);
        
    return String.join(" ", order);
  }
}