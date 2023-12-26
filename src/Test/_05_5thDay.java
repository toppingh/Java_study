package Test;

// 나이 출력 (2022년 기준)
class Solution11 {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }
}

// 각도 구하기
class Solution12 {
    public int solution(int angle) {
        int answer = 0;
        if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle > 0 && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle == 180) {
            answer = 4;
        }

        return answer;
    }
}

// 각도 구하기 - 삼항 연산자!!
class Solution13 {
    public int solution(int angle) {

        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }
}

// 짝수의 합
class Solution14 {
    public int solution(int n) {
        int answer = 0;
        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                answer += i;
            }
            continue;
        }
        return answer;
    }
}

public class _05_5thDay {
}
