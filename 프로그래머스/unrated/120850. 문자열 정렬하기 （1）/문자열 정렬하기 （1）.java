import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[my_string.length()];

        for(int i = 0; i < my_string.length(); i++){
                answer[i] = my_string.charAt(i) - '0'; 
        }
        
        return Arrays.stream(answer).filter(i -> i >= 0 && i < 10).sorted().toArray();
    }
}