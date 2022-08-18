import java.util.Scanner;
public class demo1{
    static int []da=new int[100];
    static int sum=0;
    static int j=0;
    static int [][]digui=new int[8][8];
    static int max=8;
    static int count=0;
    boolean flag=true;
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
        
//        for (int j : array) {
//            System.out.print(j + " ");
//        }
        for(int i=0;i<8;i++){
            sum+=digui[i][array[i]];
        }
        da[count]=sum;
        count++;
       // System.out.print(sum);
        sum=0;
     //   System.out.println();
    }
    public static  boolean check(int n) {
        
        for(int i=0;i<n;i++) {
            if(array[i]==array[n]||Math.abs(n-i)==Math.abs(array[n]-array[i])) {
                return false;
            }
        }
        return 	true;
    }
    public static int max(int []ar){
        int max=ar[0];
        for (int i=1;i<ar.length;i++) {
            if(max<ar[i]){
                max=ar[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                digui[i][j]=s.nextInt();
            }
        }
        dfs(0);
      //  System.out.println(count);
        System.out.println(max(da));
    }
}
