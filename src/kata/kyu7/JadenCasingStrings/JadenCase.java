package kata.kyu7.JadenCasingStrings;

public class JadenCase {

	public String toJadenCase(String phrase) {
		
		if (phrase == null || phrase.equals("")) {
    
			return null;
      
		}
    
    String[] words = phrase.split(" ");
    
    String capitalizePhrase = "";
    
      for (String w : words) {
      
        String firstLetter = w.substring(0,1);  
        String afterFirst = w.substring(1);  
        capitalizePhrase += firstLetter.toUpperCase() + afterFirst + " ";  
        
      }
      
    return capitalizePhrase.trim();
	}

}
