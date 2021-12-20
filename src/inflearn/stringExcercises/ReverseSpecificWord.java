package inflearn.stringExcercises;

import java.util.Scanner;

/*
 * 특정 문자 뒤집기
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */

public class ReverseSpecificWord {

	public static String solution(String input) {

		String answer = "";
		char[] ch = input.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
				answer += ch[ch.length - i - 1];
			} else {
				answer += ch[i];
			}
		}

		return answer;
	}

	public static String solution2(String input) {

		String answer = "";
		char[] ch = input.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			if (Character.isAlphabetic(ch[i])) {
				answer += ch[ch.length - i - 1];
			} else {
				answer += ch[i];
			}
		}

		return answer;
	}

	public static String solution3(String input) {

		char[] ch = input.toCharArray();
		int lt = 0;
		int rt = ch.length - 1;

		while (lt < rt) {
			if (!Character.isAlphabetic(ch[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(ch[rt])) {
				rt--;
			} else {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt++;
				rt--;
			}
		}

		return String.valueOf(ch);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		System.out.println(solution(input));
		System.out.println(solution2(input));
		System.out.println(solution3(input));

	}

}