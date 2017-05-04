/**
 * Created by YiliaZhang on 2017/5/4
 */
public class No6_ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows)
            return s;

        char[] chars = s.toCharArray();
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i<numRows; i++){
            sb[i] = new StringBuilder();
        }
        int i = 0;
        while (i<s.length()){
            for(int j = 0; j<numRows && i<s.length(); j++){
                sb[j].append(chars[i]);
                i++;
            }
            for(int j = numRows-2; j>0&& i<s.length(); j--){
                sb[j].append(chars[i]);
                i++;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int d = 0;d<sb.length;d++){
            res.append(sb[d]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        No6_ZigZagConversion zzc = new No6_ZigZagConversion();
        System.out.println(zzc.convert("PAYPALISHIRING", 3));
    }
}
