public class PangramChecker {
  public boolean check(String sentence){
  
    return sentence.toLowerCase().chars()
      .filter(ch -> ch >= 'a' && ch <= 'z')
      .distinct()
      .count() == 26;
  }
}