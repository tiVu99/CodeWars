public class XO {
  
  public static boolean getXO (String str) {
    
    int count = 0;
    
    String[] arr = str.split("");
    
    for (int i = 0; i < arr.length; i++) {
      
      if (arr[i].equals("x") || arr[i].equals("X")) {
      
        count++;
      }
      
      else if (arr[i].equals("o") || arr[i].equals("O")) {
      
        count--;
      }
    }
    
    return count == 0;
  }
}