public class Main {
    public static void main(String[] args) {
        int[] nums = {3,1,2,1,8,7,6};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = dp[0];
        for(int i = 1;i < nums.length;i++) {
            dp[i] = 1;
            for(int j = 0;j <= i-1;j++) {
                if(nums[i] > nums[j] && dp[j]+1 > dp[i]){
                    dp[i] = dp[j]+1;
                }
            }
            if(max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}
