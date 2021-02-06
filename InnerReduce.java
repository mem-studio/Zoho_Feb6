package zoho_feb6;

import java.util.Scanner;

public class InnerReduce {
	
	public static void innerReduce(int num) {
		
		for(int i=num; i>0; i--) {
			for(int j=num; j>0; j--) {
				
				if(i >= j) {
					System.out.print(i);
				}else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		innerReduce(num);
	}

}
