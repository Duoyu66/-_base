import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class demo1{  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ans用于存放称出的不同重量
        Set<Integer> ans = new HashSet<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            //由于set在遍历的过程中不能添加元素，因此用另外一个set来存放该砝码称出的重量
            Set<Integer> temp = new HashSet<Integer>();
            Iterator<Integer> it = ans.iterator();
            while(it.hasNext()) {
                int m = it.next();
                temp.add(m+t);
                temp.add(Math.abs(m-t));
            }
            //再全部加入到ans集合中
            ans.addAll(temp);
            //砝码必定可以称出自身重量
            ans.add(t);
        }
        //要注意的是！！重量0并不能称出来！！因此要去掉元素0
        //我栽在这里了（佛）
        ans.remove(0);
        //最后只需要输出答案集中的个数即可
        System.out.println(ans.size());
    }
    
}
