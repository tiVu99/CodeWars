package kata.kyu6.DigitalRoot;

public class DRoot {
	  public static int digital_root(int n) {

	  int sum = 0;
	  int num = 0;
	  
	    
	    while (n > 0) {
	    
	      num = n % 10;
	      
	      sum += num;
	      
	      n = n / 10;
	      
	    }
	    
	    if (String.valueOf(sum).length() == 1) {
	    
	      return sum;
	      
	    }
	    
	    else
	    
	  return digital_root(sum);
	  
	  }
	}
