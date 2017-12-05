/**
 * Created by yzhang46 on 2017/12/5.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which will return whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class No278_FirstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//    public int firstBadVersion(int n) {
//        int start = 1, end = n;
//        while (start < end) {
//            int mid = start + (end-start) / 2;
//            if (!isBadVersion(mid))
//                start = mid + 1;
//            else
//                end = mid;
//        }
//        return start;
//    }
}
