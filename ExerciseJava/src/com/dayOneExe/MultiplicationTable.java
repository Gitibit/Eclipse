package com.dayOneExe;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		for (int a =1; a<=10; a++) {
			for(int b =1 ; b<=10; b++) {
				System.out.println("******");
				System.out.println(a+ "x"+ b+ " = "+ a*b);
				/*the out put looks like this
					1x1 = 1
					1x2 = 2
					1x3 = 3
					1x4 = 4
						  */
			}
			
			
		}
	}

}


