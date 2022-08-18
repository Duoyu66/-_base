import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static int  max(double []a) {
        int len=a.length;
        double m=a[0];
        int u=0;
        for (int i = 1; i < len; i++) {
            if(m<a[i]) {
                m=a[i];
                u=i;
            }
        }
        a[u]=0;
        return u;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double sum=0;
        int n=scanner.nextInt();
        int size=scanner.nextInt();
        double []w= new double[n];
        double []p= new double[n];
        int []biao=new int[n];
        for(int i=0;i<n;i++) {
            w[i]=scanner.nextInt();
            p[i]=scanner.nextInt();
        }
        double []as=new double[n];
        for(int i=0;i<n;i++){
            as[i]=p[i]/w[i];
        }
      double []aa=new double[n];
        System.arraycopy(as, 0, aa, 0, n);
        Arrays.sort(aa);
        for(int i=0;i<n;i++){
            biao[i]=max(as);
        }
        for(int j:biao){
            System.out.print(j+" ");
        }
      while(size>0){
          for(int i=0;i<n;i++){
              if(w[biao[i]]>=size){
                  sum+=size*(p[biao[i]]/w[biao[i]]);
                  size=0;
                  break;
              }else{
                  sum+=p[biao[i]];
                  size-=w[biao[i]];
              }
          }
      }
        System.out.printf("%.1f",sum);
     
    }
}