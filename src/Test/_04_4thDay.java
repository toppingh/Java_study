package Test;

import java.util.Arrays;

class Solution10 {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);
        int max = array[array.length-1];
        int[] cnt = new int[max + 1];

        for (int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }
        int top = cnt[0];

        for (int i = 1; i < cnt.length; i++) {
            if (top < cnt[i]) {
                top = cnt[i];
                answer = i;
            } else if (top == cnt[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}

public class _04_4thDay {
}
