public class PigLatin {
    public static String pigIt(String str) {
        
        String[] arr = str.split(" ");
        
        String[] newArr = new String[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
        
          char c = arr[i].charAt(0);
        
          if (c != '?' && c != '!') {
          
              String w = arr[i];
              char letter = w.charAt(0);
              String newWord = w.substring(1) + letter + "ay";
              
              newArr[i] = newWord;
          } 
          else {
              newArr[i] = arr[i];
          }
        
        }
      
      return String.join(" ", newArr);
    }
}