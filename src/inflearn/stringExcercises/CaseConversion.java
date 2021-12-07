package inflearn.stringExcercises;

import java.util.Scanner;

/*
 * 대소문자 변환
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 */

public class CaseConversion {

	public static String solution(String input) {

		String answer = "";

		for (char c : input.toCharArray()) {
			if (Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			} else {
				answer += Character.toUpperCase(c);
			}
		}

		return answer;
	}

	public static String solution2(String input) {

		String answer = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			} else {
				answer += Character.toUpperCase(c);
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		System.out.println(solution(input));
		System.out.println(solution2(input));
	}
}
