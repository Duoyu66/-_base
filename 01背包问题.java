class Main {
    public static void main(String[] args) {
        int[] tiji = {2, 3, 4, 5};//每个物品的体积
        int[] price = {3, 4, 5, 6};//每个物品的价值
        int size = 8;
        int[][] dp = new int[tiji.length + 1][size + 1];
        for(int i=0;i<size+1;i++){
            dp[0][i]=0;
        }
        for(int i=0;i<tiji.length+1;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<tiji.length+1;i++){
            for(int j=1;j<size+1;j++){//如果装的下那么在（price(i-1)+这个价值）和前一个的最大价值取较大的
                if(tiji[i-1]<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i-1][j-tiji[i-1]],dp[i-1][j]);
                }
                else{//如果装不下，那么最大价值跟上一个的最优解相同
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[tiji.length][size]);
    }
}