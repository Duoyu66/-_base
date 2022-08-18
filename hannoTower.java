public class Main1 {
    public static void hanoiTower(int n,char a,char b,char c) {
        if(n==1) {
            System.out.println("第一个盘从 "+a+"->"+c);
        }else{
            hanoiTower(n-1, a, c,b);
            System.out.println("第"+n+"个盘从 "+a+"->"+c);
            hanoiTower(n-1, b,a, c);
        }
    }
    public static void main(String[] args) {
        hanoiTower(3, 'a', 'b', 'c');
    }
}
