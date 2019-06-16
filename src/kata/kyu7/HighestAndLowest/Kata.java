package kata.kyu7.HighestAndLowest;

public class Kata {
	  public static String HighAndLow(String numbers) {
	    
	    String[] strArr = numbers.split(" ");
	    
	    int[] numArr = new int[strArr.length];
	    
	      for (int i = 0; i < strArr.length; i++) {
	      
	        String num = strArr[i];
	        
	        numArr[i] = Integer.parseInt(num);
	        
	      }
	      
	    int smallest = numArr[0];
			int largest = numArr[0];
			
			for(int i = 1; i < numArr.length; i++) {
	    
				if(numArr[i] > largest)
					largest = numArr[i];
	        
				else if (numArr[i] < smallest)
					smallest = numArr[i];
				
			}
	    
	    return String.format("%s %s", largest, smallest);
	  }
	}
