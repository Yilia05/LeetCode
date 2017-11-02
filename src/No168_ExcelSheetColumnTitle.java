/**
 * Created by yzhang46 on 2017/11/2.
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 */
public class No168_ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
        return result.toString();
    }
}
