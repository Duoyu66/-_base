import java.util.Scanner;
class Main{
    public String fun(String str,int i){
        String rn="";
        if(i<str.length()){
            rn=str.charAt(i)+"-"+fun(str,i+1);
        }
        return rn;
    }
    public static void main(String[] args){
        Main m=new Main();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(m.fun(str,0));
    }
}