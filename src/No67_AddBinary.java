/**
 * Created by yzhang46 on 2017/11/16.
 * Given two binary strings, return their sum (also a binary string).
 * For example
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class No67_AddBinary {
    public String addBinary(String a, String b) {
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        StringBuilder stb = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;

        int aByte;
        int bByte;
        int plus = 0;
        int result;

        while(i>-1 || j>-1 || plus==1){
            aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
            bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
            result = aByte ^ bByte ^ plus;
            plus = ((aByte + bByte + plus) >= 2) ? 1 : 0;
            stb.append(result);
        }
        return stb.reverse().toString();

    }

}
