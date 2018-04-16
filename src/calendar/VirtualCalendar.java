/*
		 * 월을 입력하면 해당월의 달력을 출력한다.
		 * 달력은 모양은 1단계에서 작성한 모양으로 만든다.
		 * 1일은 일요일로 정해도 무방하다.
		 * -1을 입력받기 전까지 반복 입력받는다.
		 * 프롬프트를 출력한다.
		 * */

package calendar;

import java.util.Scanner;

public class VirtualCalendar {
	
	private final static String PROMPT = "cal>"; //변경 안되는 거를 final static 을 사용함 ,보통 대문자로 사용
	
		
	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		SubVirtualCalendar cal = new SubVirtualCalendar();

		while (true) {

			System.out.println("값을 입력해주세여: ");
			System.out.print(PROMPT+" ");
			int num = scan.nextInt();
			if (num < 1) {
				break;
			}
			if (num > 12) {
				System.out.println("1 이상 11이하 의 값을 입력해주시면 감사하겠습니다.");
				continue;

			}
			// 횟수가 정해지지 않을 떄는 while 정해져있을 땐 for 문을 사용하는 것이 좋습니다.

			cal.printCalendar(2018, num);

		}
		System.out.println("BYE");
		scan.close();
		
	}

	public static void main(String[] args) {
		//셀 실행
		VirtualCalendar v = new VirtualCalendar();
		v.runPrompt();
		

		

	}

}

