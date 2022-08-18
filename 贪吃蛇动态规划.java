import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int [][]she=new int[x][y];
        int [][]dp=new int[x][y];
        int num=s.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                she[i][j]=0;
            }
        }
        for(int i=0;i<num;i++){
            int h=s.nextInt();
            int z=s.nextInt();
            she[h][z]=1;
        }
        
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i==0&&j==0){
                    dp[0][0]=she[0][0];
                }else if(i==0){
                    dp[i][j]=she[i][j]+she[i][j-1];
                    she[i][j]=dp[i][j];
                }else if(j==0){
                    dp[i][j]=she[i-1][j]+she[i][j];
                    she[i][j]=dp[i][j];
                }else{
                    dp[i][j]=she[i][j]+Math.max(she[i-1][j],she[i][j-1]);
                    she[i][j]=dp[i][j];
                }
            }
        }
        System.out.println(dp[x-1][y-1]);
    }
}
