package Test;

// 피자 나눠 먹기(1)
class Solution22 {
    public int solution(int n) {
        int answer = 0;
        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }
        return answer;
    }
}

// 피자 나눠 먹기(1) -> 삼항 연산자!
class Solution23 {
    public int solution(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}

// 피자 나눠 먹기(1) -> 어떤 수를 7로 나누면 나머지가 0부터 6까지만 나온다
class Solution24 {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}

// 양꼬치
class Solution25 {
    public int solution(int n, int k) {
        int answer = n * 12000 + k * 2000;
        if (n > 9 && k > 0 ) {
            answer -= n / 10 * 2000;
        } else if (n < 10) {
            return answer;
        }
        return answer;
    }
}

// 양꼬치 -> 간단ver
class Solution26 {
    public int solution(int n, int k) {
        return n * 12000 + k * 2000 - (n / 10 * 2000);
    }
}

public class _09_9Day {
}
