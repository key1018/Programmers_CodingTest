import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array); // array 정렬
        return array[array.length / 2];
    }
}