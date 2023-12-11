import java.util.*;

class Solution {
    public int solution(int order) {
        String str = order + "";
        int[] Ostr = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            Ostr[i] = str.charAt(i) - '0';
        }
        return (int)Arrays.stream(Ostr).filter(i -> i == 3 || i == 6 || i == 9).count();
    }
}