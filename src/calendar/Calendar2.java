package calendar;

import java.util.Scanner; //trl+shift+M 하면 자동으로 import

public class Calendar2 {
	public static void main(String[] args) {
		System.out.println("달을 입력해주세요: ");
		Scanner scan = new Scanner(System.in); 
		int number = scan.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		System.out.println(number+"월은 "+maxDays[number-1]+"까지있습니다."); //배열이라 0부터 시작
		scan.close();
		
		
		
		
		
	}
}
