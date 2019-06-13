package kata.kyu8.CountingSheep;

public class Counter {
	  public int countSheeps(Boolean[] arrayOfSheeps) {
	  
	  int count = 0;
	  
	    for (int i = 0; i < arrayOfSheeps.length; i++) {
	    
	      Boolean value = arrayOfSheeps[i];
	      
	      if (arrayOfSheeps.length == 0) {
	  
	        return count;
	    
	      }
	      
	      if (value == null) {
	      
	        count += 0;
	      }
	      
	      else if (value == true) {
	      
	        count++;
	      }
	      
	    }
	    
	  return count;
	  }
	}
