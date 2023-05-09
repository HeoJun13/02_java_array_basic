package step2_01.array;

import java.util.Random;

//16시 40분 ~ 
//


/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */


public class ArrayEx08_필기 {

	

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		char[] mark = new char[5];
		int  totla = 0;
		
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5)+1;
		}
		
		for (int i = 0; i < hgd.length; i++) {
			if (answer[i] == hgd[i]) {
				mark[i] = 'o';
				totla +=20;
			} else {
				mark[i]= 'x';
			}
		}
		System.out.println("Answer :");
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i] + " ");
		}
		System.out.println();
		
		System.out.println("hgd   :");
		for (int i = 0; i < hgd.length; i++) {
			System.out.println(hgd[i] + " ");
		}
		System.out.println();
		
		System.out.println("정오표 : ");
		for (int i = 0; i < mark.length; i++) {
			System.out.println(mark[i] + " ");
		}
	
		System.out.println();
		System.out.println("성적 :" + totla);
	}
 }
