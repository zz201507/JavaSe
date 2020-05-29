package studing;
import java.util.*;
public class Paixu {
	public static void main(String[] args) {
		int i;
		int num[];
		num=new int[10];
		System.out.println("请输入需要排序的10个数字，用空格隔开！");
		Scanner input=new Scanner(System.in);
		for(i=0;i<num.length;i++) {
			num[i]=input.nextInt();
		}
		Arrays.sort(num);
		for(i=0;i<num.length;i++)
			System.out.print(num[i]+"\t");
	}

}
