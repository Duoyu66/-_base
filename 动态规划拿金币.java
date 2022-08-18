import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][]t=new int[n][n];
        int [][]dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                t[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j>0){
                    dp[i][j]=t[i][j]+t[i][j-1];
                    t[i][j]=dp[i][j];
                }else if(i == 0){
                    dp[i][j]=t[i][j];
                }else if(j == 0){
                    dp[i][j]=t[i-1][j]+t[i][j];
                    t[i][j]=dp[i][j];
                }
                else{
                    dp[i][j]=t[i][j]+Math.max(t[i-1][j],t[i][j-1]);
                    t[i][j]=dp[i][j];
                }
            }
        }
    
        System.out.print(dp[n-1][n-1]);
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(dp[i][j]+" ");
//               
//            }
//            System.out.println();
//        }
    }
}
