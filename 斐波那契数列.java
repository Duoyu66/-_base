//斐波那契数列
class Main{
    public int fun(int n) {
        int i = 2;
        int num=0;
        if(n==0||n==1){return n;}
        else if (i <= n) {
             num = fun(n - 1) + fun(n - 2);
        }
        return num;
    }
    public static void main(String[] args){
        Main m=new Main();
        System.out.println(m.fun(7));
    }
}