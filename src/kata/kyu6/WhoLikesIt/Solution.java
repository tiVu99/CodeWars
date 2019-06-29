class Solution {
    public static String whoLikesIt(String... names) {
    
    
    if (names.length == 0) {
    
      return "no one likes this";
    }
    
    if (names.length == 1) {
    
      return String.format("%s likes this", String.valueOf(names[0]));
    }
    
    if (names.length == 2) {
          
      return String.format("%1$s and %2$s like this", String.valueOf(names[0]), String.valueOf(names[1]));
            
    }
    
    if (names.length == 3) {
          
      return String.format("%1$s, %2$s and %3$s like this", String.valueOf(names[0]), String.valueOf(names[1]), String.valueOf(names[2]));
            
    }
    
    if (names.length > 3) {
    
      return String.format("%1$s, %2$s and %3$s others like this", String.valueOf(names[0]), String.valueOf(names[1]), String.valueOf(names.length - 2));
    }
        
      return "";
    }
}