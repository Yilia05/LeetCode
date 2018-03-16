import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yilia on 2018/3/8.
 */
public class Test{
  transient String passwd;
  transient int nameId;
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    ArrayList<Integer> res = new ArrayList<>();
    res = listMulti(3,list);
    System.out.println(res);

    Object o = new Object();
    // 1: o.equals();
    // 2: o.hashCode();
    // 3: o.toString();
    // 4: o.getClass();
    // 5: o.notify();
    // 6: o.notifyAll();
    // 7: o.wait();
    // 8: private registerNatives()
    // 9: protected clone()
    // 10: protected finalize()

  }

  public static ArrayList<Integer> listMulti(int number, List<Integer> nums){
    ArrayList<Integer> res = new ArrayList<>();
    for(int i = 0; i<nums.size(); i++){
      res.add(number*nums.get(i));
    }
    return res;
  }

}
