package Test;

// 아이스 아메리카노 (내 풀이) => if문은 필요없음!!
class Solution27 {
    public int[] solution(int money) {
        int[] answer = {0, 0};
        if (5500 % money == 0) {
            answer[0] += 1;
        } else {

            answer[0] = money / 5500;
            answer[1] = money % 5500;
        }
        return answer;
    }
}

// 아이스 아메리카노 -> 간단 ver
class Solution28 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }
}

// 아이스 아메리카노 -> 더 간단 ver
class Solution29 {
    public int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}

// 배열 뒤집기 (내 풀이)
class Solution30 {
    public int[] solution(int[] num_list) {
        int[] answer = {num_list.length};
        for(int i = num_list.length; i > 0; i--) {
            answer[num_list.length - i] = num_list[i];
        }
        return answer;
    }
}

public class _10_10Day {
}
