import java.util.StringTokenizer;

/**
 * Created by Yilia on 2018/2/13.
 */
public class TestTokenizer {
  public static void main(String[] args){
    String s = new String("The=Java=platform=is=the=ideal");
    StringTokenizer st = new StringTokenizer(s, "=", true);

    System.out.println("Token Total:" + st.countTokens());

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }

}
