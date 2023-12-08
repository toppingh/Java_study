package Test;

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

public class _03_ThirdDay {

}
