public class DnaStrand {
  public static String makeComplement(String dna) {
  
  StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < dna.length(); i++) {
    
      if (dna.charAt(i) == 'A') {
        
        sb.append("T");
      }
      
      if (dna.charAt(i) == 'T') {
        
        sb.append("A");
      }
      
      if (dna.charAt(i) == 'G') {
        
        sb.append("C");
      }
      
      if (dna.charAt(i) == 'C') {
        
        sb.append("G");
      }
    
    }
    
    return sb.toString();
  }
}
