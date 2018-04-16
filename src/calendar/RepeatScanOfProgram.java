package calendar;

import java.util.Scanner;

public class RepeatScanOfProgram {
	private static final int[] MaxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return MaxDays[month-1];
		
	}
	
	

	
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		RepeatScanOfProgram cal = new RepeatScanOfProgram();
		System.out.println("반복횟수를 입력해주세여: ");
		int repeat = scan.nextInt();
		
		
		for(int i=0; i<repeat; i++ ) {
			
			System.out.println("값을 입력해주세여: ");
			int num = scan.nextInt();
			
			System.out.println(num + "월은 "+cal.maxDaysOfMonth(num) + "까지 있습니다.");
			
		}
		System.out.println("BYE");
		scan.close();
	
	}

}
