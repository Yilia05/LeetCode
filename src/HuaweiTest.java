//import java.util.HashMap;
//
///**
// * Created by Yilia on 2018/3/21.
// */
//public class HuaweiTest {
//
//  int sum = 0;
//  StringBuilder resHelp;
//
//  public void getMax(String str) {
//    for (int i = 0; i < str.length(); i++) {
//      if (!Character.isDigit(str.charAt(i))) {
//        resHelp.append("a");
//      } else {
//        resHelp.append(str.charAt(i));
//      }
//    }
//
//    String[] strs = resHelp.toString().split("a");
//    for (int i = 0; i < resHelp.length(); i++) {
//      sum = strs[i].length() > sum ? strs[i].length() : sum;
//    }
//
//    for (int i = 0; i < strs.length; i++) {
//      if (strs[i].length() == sum)
//        System.out.print(strs[i]);
//    }
//
//  }
//
//
//  public String multiBigNumber(String s1, String s2) {
//    int longArray[] = null;
//    int shortArray[] = null;
//    int s1Length = s1.length();
//    int s2Length = s2.length();
//    int longLength = s1Length > s2Length ? s1Length : s2Length;
//    int shortLength = s1Length == longLength ? s2Length : s1Length;
//    longArray = new int[longLength];
//    shortArray = new int[shortLength];
//    String longString = s1Length >= s2Length ? s1 : s2;
//    String shortString = s1.equals(longString) ? s2 : s1;
//    //System.out.println("longString="+longString+"; shortString="+shortString);
//    //低位在前，高位在后
//    for (int i = longLength - 1; i >= 0; i--) {
//      longArray[longLength - 1 - i] = longString.charAt(i) - 48;
//    }
//    for (int i = shortLength - 1; i >= 0; i--) {
//      shortArray[shortLength - 1 - i] = shortString.charAt(i) - 48;
//    }
//
//    StringBuffer results[] = new StringBuffer[longLength];
//    for (int i = 0; i < results.length; i++) {
//      results[i] = new StringBuffer();
//    }
//    StringBuffer resultBuffer = new StringBuffer();
//
//    for (int i = 0; i < longLength; i++) {
//      int temp = 0;
//      int tempCarry = 0;//低位向高位的进位
//      int currentValue = 0; //当前位乘积的值
//      for (int j = 0; j < shortLength; j++) {
//
//        temp = longArray[i] * shortArray[j] + tempCarry;
//        //System.out.println("longArray[i]="+longArray[i]+" * "+"shortArray[j]="+shortArray[j]+" + "+tempCarry+" = "+temp);
//        tempCarry = temp / 10;
//        currentValue = temp % 10;
//        results[i].append(currentValue);
//        if (j == shortLength - 1) {
//          results[i].append(tempCarry);//最高位有进位则进位，无进位则补0
//        }
//      }
//      System.out.println(results[i].toString());
//    }
//
//    for (int i = 0, length = results.length; i < length; i++) {
//      String temp = "";
//      for (int j = 0; j < i; j++) {
//        temp += "0";
//      }
//      results[i].insert(0, temp);
//      System.out.println(results[i].toString());
//    }
//
//    int tempCarry = 0;
//    int currentValue = 0;
//    StringBuffer lastBuffer = results[results.length - 1];
//    //需要循环的次数
//    int times = lastBuffer.length();
//
//    for (int i = 0; i < times; i++) {
//      int temp = 0;
//      for (int j = 0, length2 = results.length; j < length2; j++) {
//        if (results[j].length() > i) {
//          temp += (results[j].charAt(i) - 48);//把第j行的第i位的字符转换成int
//        }
//      }
//      temp += tempCarry;
//      tempCarry = temp / 10;
//      currentValue = temp % 10;
//      resultBuffer.append(currentValue);
//    }
//
//    StringBuffer finalResult = new StringBuffer();
//
//    boolean hasNumNotZero = false;
//    //因为低位在前，高位在后，所以把29394621 转换成最终结果：12649392
//    for (int i = resultBuffer.length() - 1; i >= 0; i--) {
//      int temp = resultBuffer.charAt(i) - 48;
//      if (temp != 0)
//        hasNumNotZero = true;
//      if (hasNumNotZero)
//        finalResult.append(temp);
//    }
//    if (finalResult.length() == 0)
//      finalResult.append(0);
//    return finalResult.toString();
//
//  }
//
//  public static String multiply(String num1, String num2) {
//    int l = num1.length();
//    int r = num2.length();
//    //用来存储结果的数组，可以肯定的是两数相乘的结果的长度，肯定不会大于两个数各自长度的和。
//    int[] num = new int[l + r];
//    //第一个数按位循环
//    for (int i = 0; (i < l) && (num1.charAt(l-1-i) != '-'); i++) {
//      //得到最低位的数字
//      int n1 = num1.charAt(l - 1 - i) - '0';
//      //保存进位
//      int tmp = 0;
//      //第二个数按位循环
//      for (int j = 0; (j < r) && (num2.charAt(r-1-j)!='-'); j++) {
//        int n2 = num2.charAt(r - 1 - j) - '0';
//        //拿出此时的结果数组里存的数+现在计算的结果数+上一个进位数
//        tmp = tmp + num[i + j] + n1 * n2;
//        //得到此时结果位的值
//        num[i + j] = tmp % 10;
//        //此时的进位
//        tmp /= 10;
//      }
//      //第一轮结束后，如果有进位，将其放入到更高位
//      num[i + r] = tmp;
//    }
//
//    int i = l + r - 1;
//    //计算最终结果值到底是几位数，
//    while (i > 0 && num[i] == 0) {
//      i--;
//    }
//
//    String result = "";
//    if(num1.contains("-") && !num2.contains("-")){
//      result += "-";
//    }
//    else if(!num1.contains("-") && num2.contains("-")){
//      result += "-";
//    }
//    //将数组结果反过来放，符合正常读的顺序，
//    //数组保存的是：1 2 3 4 5
//    //但其表达的是54321，五万四千三百二十一。
//    while (i >= 0) {
//      result += num[i--];
//    }
//    return result;
//  }
//
//  int n;
//  String[] inputBytes = new String[n];
//  public int[] boring(int n, String[] inputBytes, ){
//    HashMap<String,String>
//
//  }
//
//
//
//
//
//
//
//
//  public static void main(String[] args) {
//    System.out.println(multiply("-12341234","43214321"));
//  }
//
//
//}
