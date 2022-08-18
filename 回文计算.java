import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main2 {
    //设置一个方法，判断是否符合日期格式，网上转载的方法
    public static boolean isTime(String data) {
        String dt = data.substring(0,4) + "-"
                + data.substring(4,6) + "-" + data.substring(6,8);
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
        //SimpleDateFormat设置你输入的日期格式
        try {
            sdt.setLenient(false);//设置lenient为false,否则SimpleDateFormat会比较宽松的验证日期
            sdt.parse(dt);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        long  Date = scan.nextLong();
        Date++;//因为你一开始比较就比较的是他的下一个数，而不是他而不他本身
        String[] Data = new String[1];
        
        //在此输入您的代码...
        int time = 0;
        while(true){
            //将long型转化为String类型并存于String型数组里
            Data[0] = Date + "";
            //一下便是ABCDDABC格式特点
            if(Data[0].charAt(0) == Data[0].charAt(7) &&
                    Data[0].charAt(1) == Data[0].charAt(6) &&
                    Data[0].charAt(2) == Data[0].charAt(5) &&
                    Data[0].charAt(3) == Data[0].charAt(4) && isTime(Data[0]) && time<1 ){
                System.out.println(Data[0]);
                time++;//用来控制只输出一次
                
            }
            //一下是ABABBABA格式的特点
            if(     Data[0].charAt(0) == Data[0].charAt(2) &&
                    Data[0].charAt(2) == Data[0].charAt(5) &&
                    Data[0].charAt(5) == Data[0].charAt(7) &&
                    
                    Data[0].charAt(1) == Data[0].charAt(3) &&
                    Data[0].charAt(3) == Data[0].charAt(4) &&
                    Data[0].charAt(4) == Data[0].charAt(6) &&
                    isTime(Data[0])){
                System.out.println(Data[0]);
                break;
            }
            //题目原因，两个类型回文数各只输出一个。
            Date++;
        }
    }
}
