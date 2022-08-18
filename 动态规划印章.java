//动态规划印章
//n是n种印章 m是可以抽取m次
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        double p=1.0/n;
        double[][] b=new double[m+1][n+1];
        if (n==1){  //当n=1时m>n几率为1
            b[m][n]=1;
            System.out.printf("%.4f",b[m][n]);
            return;
        }
        if (n>1&&m<n){ //当m<n时几率为0
            b[m][n]=0;
            System.out.printf("%.4f",b[m][n]);
            return;
        }
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                if (i<j) b[i][j]=0;       //当m<n时几率为0
                if (j==1){
                    b[i][j]=Math.pow(p,i-1);        //当i张集齐1种的概率
                }else {
                    b[i][j]=b[i-1][j]*(j*1.0/n)+b[i-1][j-1]*((n-j+1)*1.0/n);  //当i张集齐j种的概率
                }
                
            }
            
        }
        System.out.printf("%.4f",b[m][n]);
        
    }
}
