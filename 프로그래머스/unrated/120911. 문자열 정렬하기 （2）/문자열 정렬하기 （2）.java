import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strA = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            strA[i] = (my_string.charAt(i) + "").toLowerCase();
        }
        Arrays.sort(strA);
        for(int i = 0; i < strA.length; i++){
            answer += strA[i];
        }
        return answer;
    }
}