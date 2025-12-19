import java.util.regex.*;;

public class RegexDemo {
  public static void main(String[] args) {
    String s = "Shiv";
    String test = "ShivrajShivrajShiv";
    Pattern p = Pattern.compile(s);
    Matcher m = p.matcher(test);
    while(m.find()){
      System.out.println(m.start() + " " + (m.end()-1));
    }

  }
}