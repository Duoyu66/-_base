import java.util.Scanner;
class lan{
    static Scanner s=new Scanner(System.in);//题目大多数n是未知的
    static int n=s.nextInt();
    static int[] marks = new int[n+1];//标记某个数是否被用过,可以自己调整大小
    static int[] nums = new int[n+1];
    public static void main(String[] args) {

        d(1);//第几步
    }
    public static void d(int step) {
        if (step == n + 1) {
            for (int i = 1; i <= n; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (marks[i] == 0) {
                nums[step] = i;
                marks[i] = 1;
                d(step + 1);
                marks[i] = 0;
            }
        }
    }
}