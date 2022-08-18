//阶乘
import java.util.*;
public class Main {
    public String jie(int n){
        String str="";
        int i=1;
        if(i<=n){
            str=n+"*"+jie(n-1);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main m=new Main();
        int n=s.nextInt();
        String str1=m.jie(n);
        String str2=str1.substring(0,str1.length()-1);
        System.out.println(n+"="+str2);

    }
}

