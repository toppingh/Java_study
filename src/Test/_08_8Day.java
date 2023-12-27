package Test;

// 점의 위치 구하기
class Solution19 {
    public int solution(int[] dot) {
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                return 1;
            }
            return 4;
        } else {
            if (dot[1] > 0) {
                return 2;
            }
            return 3;
        }
    }
}

// 점의 위치 구하기 - 신기한 풀이(어른의 풀이...)
class Solution20 {
    public int solution(int[] dot) {
        int xParam = dot[0] < 0 ? 1 : 0;
        int yParam = dot[1] < 0 ? 2 : 0;

        return 1 + ((xParam | yParam) ^ (yParam >> 1));
    }
}

// 편지
class Solution21 {
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}

public class _08_8Day {
}
