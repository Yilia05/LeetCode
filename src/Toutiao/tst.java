import java.util.*;


public class tst {

    Scanner sc = new Scanner(System.in);
    long n,m;
    TreeSet<Long> a = new TreeSet<>();
    TreeSet<Long> b = new TreeSet<>();
    TreeSet<Long> tmpSet;
    void solve(){
        m = sc.nextLong();
        n = sc.nextLong();
        long u;
        long ttla = 0;
        for (long i=0;i<m;i++){
            u = sc.nextInt();
            a.add(u);
            ttla += u;
        }
        long ttlb = 0;
        for (long i=0;i<n;i++){
            u = sc.nextInt();
            b.add(u);
            ttlb += u;
        }
        if (ttla*n > ttlb*m){
            long t = m;
            m = n;
            n = t;
            tmpSet = a;
            a = b;
            b = tmpSet;
            t = ttla;
            ttla = ttlb;
            ttlb = t;
        }

        int rCnt = 0;
        while (ttla*n < ttlb*m && m>1){
            long amean = (long)Math.floor(ttla*1.0/m);
            Long bi = b.higher(amean);
            while (bi!=null && a.contains(bi)){
                bi = b.higher(bi);
            }
            if (bi==null || bi*m>=ttlb){
                break;
            }
            // check in a
            a.add(bi);
            ttla+=bi;
            m++;
            b.remove(bi);
            ttlb-=bi;
            n--;
            rCnt++;
        }
        System.out.println(rCnt);
    }

    public static void main(String[] args) throws Exception{
        tst M = new tst();
        M.solve();
    }
}