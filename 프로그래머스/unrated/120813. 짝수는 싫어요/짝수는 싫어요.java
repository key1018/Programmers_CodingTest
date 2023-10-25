class Solution {
    public int[] solution(int n) {
        int[] answer = new int[100];
        int index = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                answer[index] = i;
                index++;
            }
        }
        
        int[] result = new int[index];
        for(int i = 0; i < index; i++){
            result[i] = answer[i];
        }
        return result;
    }
}