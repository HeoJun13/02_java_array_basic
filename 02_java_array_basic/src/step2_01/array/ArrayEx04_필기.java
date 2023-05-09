package step2_01.array;

import java.util.Random;

// 15시 09분 ~ 15시 24분
// 반복적인 연습이 필요할듯

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */


public class ArrayEx04_필기 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		System.out.println("1번 문제");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " "
					+ "");
		}
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		System.out.println("전교생의 총점과 평균");
		int tot = 0;
		double ave = 0.0;
		for (int i = 0; i < arr.length; i++) {
			tot = tot+arr[i];	
		}
		ave = tot/5;
		System.out.println("총점은 " + tot + "입니다")
		;
		System.out.println("평균은 " + ave + "입니다");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 60) {
				cnt ++;
				System.out.println(cnt+ "명");
			}
		}

	}
	
}
