public class BouncingBall {
	
	public static int bouncingBall(double h, double bounce, double window) {
  
    double k = h * bounce;
		int count = 1;
    
    if (bounce <= 0 || bounce >= 1) {
    
      return -1;
    }
    
    if (h <= 0 || window >= h) {
    
      return -1;
    }  
    
    if (h > window && bounce < 1) {
		  while (k > window) {
			  count += 2;
			  k *= bounce;
		  }
      
      return count;
    }
    
    else
    
      return -1;
	}
}