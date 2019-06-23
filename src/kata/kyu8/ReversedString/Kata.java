package kata.kyu8.ReversedString;

public class Kata {

	  public static String solution(String str) {
	    
	    StringBuilder sb = new StringBuilder(str);
	    
	    sb.reverse();
	    
	    return sb.toString();
	  }

	}
