import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Yilia on 2018/3/23.
 */
public class ToutiaoTest {

  /**
   * 为了不断优化推荐效果，今日头条每天要存储和处理海量数据。
   * 假设有这样一种场景：我们对用户按照它们的注册时间先后来标号，
   * 对于一类文章，每个用户都有不同的喜好值，
   * 我们会想知道某一段时间内注册的用户（标号相连的一批用户）中，
   * 有多少用户对这类文章喜好值为k。
   * 因为一些特殊的原因，不会出现一个查询的用户区间完全覆盖另一个查询的用户区间(不存在L1<=L2<=R2<=R1)。
   * 输入描述:
   * 输入： 第1行为n代表用户的个数 第2行为n个整数，第i个代表用户标号为i的用户对某类文章的喜好度
   * 第3行为一个正整数q代表查询的组数  第4行到第（3+q）行，每行包含3个整数l,r,k代表一组查询，即标号为l<=i<=r的用户中对这类文章喜好值为k的用户的个数。 数据范围n <= 300000,q<=300000 k是整型
   * 输出描述:
   * 输出：一共q行，每行一个整数代表喜好值为k的用户的个数
   * @param args
   */
  public static void main1(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] like = new int[n];
    for (int i = 0; i < n; i++) {
      like[i] = scanner.nextInt();
    }
    int q = scanner.nextInt();
    LinkedList<int[]> list = new LinkedList<>();

    for (int t = 0; t < q; t++) {
      int[] query1 = new int[3];
      for (int j = 0; j < 3; j++) {
        query1[j] = scanner.nextInt();
      }
      list.add(query1);
    }

    search(n, like, list);

  }

  public static void search(int n, int[] like, List<int[]> list) {
    for (int i = 0; i < list.size(); i++) {
      int start = list.get(i)[0];
      int last = list.get(i)[1];
      int key = list.get(i)[2];

      int sum = 0;
      for (int j = start - 1; j < last - 1; j++) {
        if (like[j] == key) {
          sum++;
        }
      }
      System.out.println(sum);
    }

  }


  /**
   * 作为一个手串艺人，有金主向你订购了一条包含n个杂色串珠的手串——每个串珠要么无色，
   * 要么涂了若干种颜色。为了使手串的色彩看起来不那么单调，
   * 金主要求，手串上的任意一种颜色（不包含无色），
   * 在任意连续的m个串珠里至多出现一次（注意这里手串是一个环形）。
   * 手串上的颜色一共有c种。现在按顺时针序告诉你n个串珠的手串上，
   * 每个串珠用所包含的颜色分别有哪些。请你判断该手串上有多少种颜色不符合要求。
   * 即询问有多少种颜色在任意连续m个串珠中出现了至少两次。
   * 输入描述:
   * 第一行输入n，m，c三个数，用空格隔开。(1 <= n <= 10000, 1 <= m <= 1000, 1 <= c <= 50) 接下来n行每行的第一个数num_i(0 <= num_i <= c)表示第i颗珠子有多少种颜色。接下来依次读入num_i个数字，每个数字x表示第i颗柱子上包含第x种颜色(1 <= x <= c)
   * 输出描述:
   * 一个非负整数，表示该手链上有多少种颜色不符需求。
   * @param args
   *
   * 1、使用vector<unordered_set<int>>vec来存储每个珠子的颜色，外面的vec[i]代表每个珠子，
   * 而每个vec[i]都是一个set集，代表当前珠子的颜色集，使用set方便查找某个颜色存不存在。
   * 2.因为考虑到了珠子颜色不在某个间距内重复是个环的问题，所以当不在m步内出现时，
   * 直接把输入数组vec的前m-1项复制一遍插入到vec后面，就不用理会环的问题处理了。代码如下：
   */
  public static void main2(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int c = scanner.nextInt();
    LinkedList<int[]> list = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      int x = scanner.nextInt();
      int[] color = new int[x];
      for (int j = 0; j < x; j++) {
        color[j] = scanner.nextInt();
      }
      list.add(color);
    }

  }

  public static void wrongColor(){

  }

//  for(int i=1; i<=clo; ++i)
//  {
//    for(int j=0; j<=size-m; )
//    {
//      int r = -1;
//      bool bFind = false;
//      int count = 0;
//      for(int k=j; k<j+m; ++k)
//      {
//        if(vec[k].count(i) < 1)
//        {
//          if(count == 0)
//            r = k;
//        }
//        else
//        {
//          ++count;
//          if(count > 1)
//          {
//            ++res;
//            bFind = true;
//            break;
//          }
//        }
//      }
//      if(bFind)
//        break;
//      if(j+1 < r)
//        j = r;
//      else
//        ++j;
//    }
//  }


  /**
   * 字符串S由小写字母构成，长度为n。定义一种操作，
   * 每次都可以挑选字符串中任意的两个相邻字母进行交换。
   * 询问在至多交换m次之后，字符串中最多有多少个连续的位置上的字母相同？
   *
   * 输入描述:
   * 第一行为一个字符串S与一个非负整数m。(1 <= |S| <= 1000, 1 <= m <= 1000000)
   * 输出描述:
   * 一个非负整数，表示操作之后，连续最长的相同字母数量。
   * @param args
   */
  public static void main3(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    int m = scanner.nextInt();


    HashMap<Character, LinkedList<Integer>> map = new HashMap<>();
    ArrayList<Character> set = new ArrayList<>();
    for(int i = 0; i<string.length(); i++) {
      if(map.containsKey(string.charAt(i))) {
        map.get(string.charAt(i)).add(i);
      }
      else{
        set.add(string.charAt(i));
        LinkedList<Integer> loc = new LinkedList<>();
        loc.add(i);
        map.put(string.charAt(i), loc);
      }
    }
    maxChars(m, set, map);
  }

  public static void maxChars(int m, ArrayList<Character> set, HashMap<Character, LinkedList<Integer>> map) {
    for(int i = 0; i<map.size(); i++) {
      int locs = map.get(set.get(i)).size();
      for(int j = 0; j<locs; j++) {
//        int[][] dp = new int[][];
      }
    }
  }

}