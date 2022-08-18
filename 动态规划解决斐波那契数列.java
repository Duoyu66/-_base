
import java.util.*;
public class Main {
    public int dong(int n){
        int []dp=new int[n+1];//因为要遍历到n,所以是n+1
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];//第n项对应的是n-1
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main m = new Main();
        int n=s.nextInt();
        System.out.println(m.dong(n+1));
       
    }
}

