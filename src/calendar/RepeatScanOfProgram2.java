package calendar;

import java.util.Scanner;

public class RepeatScanOfProgram2 {
	private static final int[] MaxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month) {
		return MaxDays[month-1];
		
	}
	
	

	
	
	
	public static void main(String[] args) {
		
	
		String PROMPT = "cal>";
		Scanner scan = new Scanner(System.in);
		RepeatScanOfProgram2 cal = new RepeatScanOfProgram2();
		
		
		
		
		
		
		while(true) {
			
			System.out.println("값을 입력해주세여: ");
			System.out.print(PROMPT);
			int num = scan.nextInt();
			if(num<1 ) {
				break;
				}
			if(num > 12) {
				System.out.println("1 이상 11이하 의 값을 입력해주시면 감사하겠습니다.");
				continue;
				
			}
			//횟수가 정해지지 않을 떄는 while 정해져있을 땐 for 문을 사용하는 것이 좋습니다.
			
			
			System.out.println(num + "월은 "+cal.maxDaysOfMonth(num) + "까지 있습니다.");
			
		}
		System.out.println("BYE");
		scan.close();
	
	}

}
