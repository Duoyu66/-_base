import java.util.*;
public class Main {
    static int hole, tree;  //洞，树
    static int[] beauty;  //美观度
    static boolean[] if_userd;  //洞是否被用
    static int max;
//    static boolean flag = false;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        hole = sc.nextInt();
        tree = sc.nextInt();
        beauty = new int[hole];
        if_userd = new boolean[hole];
        for(int i=0;i<hole;i++)
            beauty[i] = sc.nextInt();
        if(hole>=2*tree)  //只有当洞的数量大于树数量的两倍时才满足题意
        {
            doit(tree,0,0);
            System.out.println(max);
        }
        else
            System.out.println("Error!");
//        doit(tree,0,0);
//        if(flag) System.out.println(max);
//        else System.out.println("Error!");
    }

    private static void doit(int remain_tree, int hole_num, int sum){ //remain_tree 剩余的树，hole_num 第几个洞， sum 总的美观度
        //当剩余树的数量为0时完成递归
        if(remain_tree==0){
            if(sum>max)
                max = sum;
//            flag = true;
            return;
        }
        for(int i = hole_num;i<hole;i++){  //从hole_num 的洞往后种
            //第i个洞没有被用时
            if(if_userd[i] == false){
                if(i<hole-1)  //不是最后一个洞时
                    if_userd[i+1] = true;  //在第i个洞种树则i+1个洞不能使用
                if(i==0) {  //种在第0个洞时,最后一个洞不能种
                    if_userd[i] = true;
//                    if_userd[hole - 1] = true;
                }
                doit(remain_tree-1,i+1,sum+beauty[i]);  //第i个洞种下,然后种后面的洞,树的数量减1
                //回溯
                if(i<hole-1)
                    if_userd[i+1] = false;
                if(if_userd[0] == true)
                    if_userd[hole-1] = true;
                if(i ==0 ) {
                    if_userd[i] = false;
                    if_userd[hole - 1] = false;
                }
            }
        }
    }
}
