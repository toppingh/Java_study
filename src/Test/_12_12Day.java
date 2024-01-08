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

public class _12_12Day {
}
