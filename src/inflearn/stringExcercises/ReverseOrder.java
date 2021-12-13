package inflearn.stringExcercises;

import java.util.Scanner;

/*
 * 단어 뒤집기
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 */

public class ReverseOrder {

	public static void solution(String[] words) {

		for (String w : words) {
			String answer = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				answer += w.charAt(i);
			}
			System.out.println(answer);
		}
	}

	public static void solution2(String[] words) {

		for (String w : words) {
			StringBuffer buffer = new StringBuffer(w);
			System.out.println(buffer.reverse());
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String[] words = new String[n];

		for (int i = 0; i < n; i++) {
			words[i] = scanner.next();
		}

		solution(words);
		solution2(words);

	}

}
