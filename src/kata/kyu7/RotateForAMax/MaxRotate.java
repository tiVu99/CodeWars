package kata.kyu7.RotateForAMax;

public class MaxRotate {
	
	/*public static int digitsNumber(long n) {
		
		int digits = 0; 
    	
    		while (n > 0) { 
    		
    			digits++; 
    			n /= 10; 
    		}
    	
    	return digits;
	}*/
    
    public static long maxRot (long n) {
    	
    	/*int digits = digitsNumber(n);
    	
    	//System.out.println(digits);
        	
        long pow = (long) Math.pow(10, digits - 1);
        
        int rot = 0;
        
        //System.out.println(pow);
        	
        	for (int i = 0; i < digits - 1; i++) {
        	
        		long firstDigit = n / pow;
        		
        		//System.out.println(firstDigit);
        	
        		rot = (int) (((n * 10) + firstDigit) - (firstDigit * pow * 10));
        	
        		System.out.print(rot + " ");
        		
        		n = rot;
        	
        	}
        
        return rot;*/
        
        long max = n;
        
        StringBuilder number = new StringBuilder("" + n);
       
        	for(int i = 0; i < number.length() - 1; i++) {
        	
        char digit = number.charAt(i);
        number.deleteCharAt(i);
        number.append(digit);
        
        long result = Long.parseLong(number.toString());
        
        		if(result > max) {
        	
        			max = result;
        		}
        	}
        return max;
    }
    
    public static void main(String args[]) {
    	
    	maxRot(38458215);
    }
}
