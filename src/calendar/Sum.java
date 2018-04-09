package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 두수의 입력을 받고 더하는 프로그램
		String a, b;
		System.out.println("두수를 입력하세요");

		Scanner scan = new Scanner(System.in);
		int n1, n2;
		a = scan.next();
		b = scan.next();
		n1 = Integer.parseInt(a); // a, b를 정수형 변수로 만들겠다.
		n2 = Integer.parseInt(b);
		int result = n1 + n2;
		// printf 자바에도 존재
		System.out.printf("%d\n", n1+n2 );
		System.out.println(result);
		scan.close(); // 입력 프로그램을 열었던걸 닫는거!! 닫는 습괸을 들이자. 원인은 웬만하면 없게 코딩!!

	}
}
