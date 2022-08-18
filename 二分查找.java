import java.util.Scanner;
public class beibao {//蓝桥杯二分查数 有返回第几项，无向第几项插入
        public static int erfen(int []a,int n,int left,int right) {
            int mid=(left+right)/2;
            int midVal=a[mid];
            int j=0;
            if(left>right) {
                for(int i=0;i<a.length;i++) {
                    if(n<a[i]) {
                        mid=i;
                        break;
                    }else {
                        mid=a.length;
                    }
                }
                return mid+1;
            }
            if(n>midVal) {
                return erfen(a, n, mid+1, right);
            }else if(n<midVal){
                return erfen(a, n, left, mid-1);
            }else {
                return mid+1;
            }
        }
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int []p=new int[n];
                for(int i=0;i<p.length;i++) {
                    p[i]=scanner.nextInt();
                }
                int val=scanner.nextInt();
                scanner.close();
                    System.out.println(erfen(p, val, 0, p.length-1));
        }
}
