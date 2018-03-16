import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class alibaba2018Spring {
  /** 请完成下面这个函数，实现题目要求的功能
  当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
  public static void main(String[] args) {

    List<Integer> order = new ArrayList<Integer>();
    Map<String, List<Integer>> boms = new HashMap<String, List<Integer>>();

    Scanner in = new Scanner(System.in);
    String line = in.nextLine();

    Integer n = Integer.parseInt(line.split(",")[0]);
    Integer m = Integer.parseInt(line.split(",")[1]);

    line = in.nextLine();
    String[] itemCnt = line.split(",");
    for(int i = 0; i < n ; i++){
      order.add(Integer.parseInt(itemCnt[i]));
    }

    for(int i = 0; i < m; i++){
      line = in.nextLine();
      String[] bomInput = line.split(",");
      List<Integer> bomDetail = new ArrayList<Integer>();

      for(int j = 1; j <= n; j++ ){
        bomDetail.add(Integer.parseInt(bomInput[j]));
      }
      boms.put(bomInput[0], bomDetail);
    }
    in.close();

    Map<String, Integer> res = resolve(order, boms);

    System.out.println("match result:");
    for(String key : res.keySet()){
      System.out.println(key+"*"+res.get(key));
    }
  }

  // write your code here
  public static Map<String, Integer> resolve(List<Integer> order, Map<String, List<Integer>> boms) {
    int min = 0x7fffffff;
    int sum = 0;
    Map<String, Integer> res = new HashMap<>();
    ArrayList<Integer> shengyu  =new ArrayList<>(order);
    for(Map.Entry<String, List<Integer>> entry : boms.entrySet()) {

      for(int i = 0; i<entry.getValue().size(); i++){
        if(shengyu.get(i) >= 0){
          shengyu.set(i, order.get(i) - entry.getValue().get(i));
        }
        for(int j=0;j<shengyu.size(); i++){
          sum+=shengyu.get(i);
        }

      }
      min = Math.min(min, sum);


    }
    return res;
  }


  public static void resolveTry (List<Integer> order, Map<String, List<Integer>> boms) {
    int n = order.size();
    List<Integer> shengyu  = new ArrayList<>(order);
    List<Integer> j = new ArrayList<>();
    List<List<Integer>> lists = new ArrayList<>();

    for(Map.Entry<String, List<Integer>> entry : boms.entrySet()){
      while (allSmaller(j,order)){
        for(int k = 0; allSmaller(listMulti(k,entry.getValue()),listDe(order,j)) && allSmaller(j,order); k++){
          j = listAdd(listMulti(k,entry.getValue()), j);
        }

      }
    }



  }

  public static boolean allSmaller(List<Integer> nums, List<Integer> order){
    for(int i = 0; i<nums.size(); i++){
      if(nums.get(i)<=order.get(i))
        return true;
    }
    return false;
  }

  public static List<Integer> listMulti(int number, List<Integer> nums){
    List<Integer> res = new ArrayList<>();
    for(int i = 0; i<nums.size(); i++){
      res.add(number*nums.get(i));
    }
    return res;
  }

  public static List<Integer> listAdd(List<Integer> add1, List<Integer> add2){
    List<Integer> res = new ArrayList<>();
    for(int i = 0; i<add1.size(); i++){
      res.add(add1.get(i)+add2.get(i));
    }
    return res;
  }

  public static List<Integer> listDe(List<Integer> de1, List<Integer> de2){
    List<Integer> res = new ArrayList<>();
    for(int i = 0; i<de1.size(); i++){
      res.add(de1.get(i)-de2.get(i));
    }
    return res;
  }
}