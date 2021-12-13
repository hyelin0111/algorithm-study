package inflearn.stringExcercises;

import java.util.Scanner;

/*
 * 문장 속 단어
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 */

public class WordInSentence {

	public static String solution(String input) {

		String answer = "";
		String[] words = input.split(" ");
		int max = 0;

		for(String w : words) {
			if(w.length() > max) {
				max = w.length();
				answer = w;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		System.out.println(solution(input));
	}
}
