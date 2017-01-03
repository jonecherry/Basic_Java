/**
 * Created by qsong on 2017/1/3.
 */
public class shangtaijie {
    public static void main(String [] args){
        System.out.println("ok");
    }
    public int shangtaijie(int n){
        if(n==1){
            return 1;
        }
        if(n ==2){
            return 2;
        }
        int res = shangtaijie(n-1) + shangtaijie(n-2);
        return res;
    }
}
