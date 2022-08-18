import java.util.Scanner;
public class demo1{ ;
    static int max=8;
    static int count=0;
    static int []array= new int[max];
    public static void dfs(int n) {
        if(n==max) {
            print();
           
            return;
        }
        for(int i=0;i<max;i++) {
            array[n]=i;
            if(check(n)) {
                dfs(n+1);
            }
        }
    }
    public static void print() {
        
        for (int j : array) {
            System.out.print(j + " ");
        }
        count++;
        System.out.println();
    }
    public static  boolean check(int n) {
        
        for(int i=0;i<n;i++) {
            if(array[i]==array[n]||Math.abs(n-i)==Math.abs(array[n]-array[i])) {
                return false;
            }
        }
        return 	true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        dfs(0);
       System.out.print(count);
    }
}
