package Test;

import java.util.Arrays;

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

// 배열 원소의 길이 (내 풀이)
class Solution34 {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

// 배열 원소의 길이 -> stream
class Solution35 {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}

// 머쓱이보다 키 큰 사람 (내 풀이)
class Solution36 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) answer += 1;
        }
        return answer;
    }
}

// 머쓱이보다 키 큰 사람 for-each문
class Solution37 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i : array) {
            if (i > height) answer++;
        }
        return answer;
    }
}
public class _11_11Day {
}
