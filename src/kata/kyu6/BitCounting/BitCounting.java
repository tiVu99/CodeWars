public class BitCounting {

	public static int countBits(int n){
  
    int count = 0;
		
    String str = Integer.toBinaryString(n);
    
    for (char c : str.toCharArray()) {
    
      if (c == '1') {
      
        count++;
        
      }
    
    }
    
    return count;
	}
	
}