package inflearn.stringExcercises;

import java.util.Scanner;

/*
 * 문자 찾기
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다. 문자열의 길이는 100을 넘지 않습니다.
 */

public class SearchCharacter {

	public static int solution(String input, String target) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (target.equalsIgnoreCase(input.charAt(i) + "")) {
				count++;
			}
		}

		return count;
	}

	public static int solution2(String input, char target) {
		int count = 0;

		for (char c : input.toCharArray()) {
			if (Character.toLowerCase(c) == Character.toLowerCase(target)) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String target = scanner.nextLine();
		char target2 = scanner.nextLine().charAt(0);

		System.out.println(solution(input, target));
		System.out.println(solution2(input, target2));

	}

}