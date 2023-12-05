import java.util.*;

class Solution {
    public int[] solution(int n) {
        int index = 0;
        int[] answer = new int[n];
        for(int i = 1; i <= n; i++){
            if(n % i == 0) {
                answer[index] = i;
                index++;
            }
        }
        return Arrays.stream(answer).filter(i -> i != 0 && n % i == 0).toArray();
    }
}