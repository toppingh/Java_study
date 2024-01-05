package Test;

// 중복된 숫자 개수 (내 풀이)
class Solution31 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer += 1;
            }
        }
        return answer;
    }
}


// 중복된 숫자 개수 -> for-each문
class Solution32 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int num : array) {
            if (num == n) answer++;
        }
        return answer;
    }
}

// 중복된 숫자 개수 -> foreach + 삼항연산자
class Solution33 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int num : array) {
            answer += num == n ? 1 : 0;
        }
        return answer;
    }
}
public class _11_11Day {
}
