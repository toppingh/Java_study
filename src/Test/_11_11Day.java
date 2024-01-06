package Test;

import java.util.Arrays;
import java.util.*;

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

// 배열 뒤집기 (내 풀이)
class Solution38 {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length];
        for(int i = 0; i <= num_list.length - 1; i++) {
            answer[i] = num_list[num_list.length - 1 - i];
        }
        return answer;
    }
}

// 최댓값 만들기(1) (내 풀이)
class Solution39 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        answer = max;
        return answer;
    }
}

// 최댓값 만들기(1) - 간단ver
class Solution40 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
public class _11_11Day {
}
