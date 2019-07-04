public class TenMinWalk {
  public static boolean isValid(char[] walk) {
  
  int cn = 0;
  int cs = 0;
  int cw = 0;
  int ce = 0;
    
    if (walk.length != 10) {
    
      return false;
    }
    
    for (int i = 0; i < walk.length; i++) {
    
      if (walk[i] == 'n') {
      
        cn++;
      }
      
      if (walk[i] == 's') {
      
        cs++;
      }
      
      if (walk[i] == 'w') {
      
        cw++;
      }
      
      if (walk[i] == 'e') {
      
        ce++;
      }
    }
    
      if (cn != cs || cw != ce) {
      
        return false;
      }
      
      else 
      
        return true;
  }
}