import java.util.ArrayList;
import java.util.List;

/*
帕斯卡三角形 
杨辉三角，又名 贾宪三角形 
*/ 
public class beibao {
	public static void main(String[] args) {
		data(10);
	}
	public static void data(int n) {
		List<int[]> list = new ArrayList<int[]>();
		int[] x0 = {1};
		int[] x1 = {1,1};
		list.add(x0);
		list.add(x1);
		for(int y=3;y<=n;y++) {
			int[] x = new int[y];
			int[] x_pre=list.get(y-2);
			for(int z=0;z<x.length;z++) {
				if(z==0) {
					x[0] = 1;
				}else if(z==x.length-1) {
					x[z] = 1;
				}else {
					x[z] = x_pre[z-1]+x_pre[z];
				}
			}
			list.add(x);
		}
		for(int[] x:list) {
			for(int y:x)System.out.print(y+" ");
			System.out.println();
		}
	}
}
