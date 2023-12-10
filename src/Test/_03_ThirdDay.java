package Test;

import java.util.Arrays;

// 분수의 덧셈 - 기약 분수 만들기 (유클리드 호제법) 공부 후 정리!
class Solution6 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0}; // int[] answer = new int[2];
        int num = denom1 * numer2 + denom2 * numer1;
        int de = denom1 * denom2;
        int max = 1;

        for(int i = 1; i <= de && i <= num; i++) {
            if (de % i == 0 && num % i == 0) {
                max = i;
            }
        }
        answer[0] = num / max;
        answer[1] = de / max;

        return answer;
    }
}

// 배열 두 배 만들기
class Solution7 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // numbers 길이만큼 배열 길이 생성
        // answer 배열에는 numbers 길이만큼 0으로 초기화

        for (int i = 0; i < numbers.length; i++) { //numbers 배열에는 값이들어있음!
            answer[i] = numbers[i] * 2;
            // 0으로 초기화된 answer배열에 numbers[i] * 2 값을넣는다
        }
        return answer;
    }
}

// 나머지 구하기
class Solution8 {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}

// 배열에서 중앙값 구하기
class Solution9 {
    public int solution(int[] array) {
        Arrays.sort(array); // 배열 오름차순 정렬
        int answer = 0;
        answer = array[array.length / 2];
        // 0으로 초기화된 answe에 array의 길이/2 인덱스 값 출력
        // answer = array[5 / 2] => array[2] => answer = 7
        return answer;
    }
}

public class _03_ThirdDay {

}
