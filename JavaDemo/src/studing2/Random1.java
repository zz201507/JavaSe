package studing2;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random dom = new Random();
		for(int i = 0;i<10;i++) {
			
		double d = (int)((Math.random())*10);
		System.out.println(d);
		}
	}

}
