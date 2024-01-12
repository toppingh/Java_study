package Test;

// 제곱수 판별하기 (내 풀이)
class Solution41 {
    public int solution(int n) {
        for (int i = 0; i < n; i++) {
            if (i * i == n) return 1;
        }
        return 2;
    }
}

// 제곱수 판별하기 (간단ver)
class Solution42 {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}

// n보다 커질때까지 덧셈 (내 풀이)
class Solution43 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}

// 문자열 안에 문자열 (내 풀이)
class Solution44 {
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}

// 문자열 안에 문자열 (삼항연산자)
class Solution45 {
    public int solution(String str1, String str2) {
        return (str1.contains(str2)? 1: 2);
    }
}

public class _12_12Day {
}
