class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int i = 0; // 짝수
        int j = 0; // 홀수
        for(int x = 0; x < num_list.length; x++){
            if(num_list[x] % 2 == 0){
                i++;
            } else {
                j++;
            }
        }
        answer[0] = i;
        answer[1] = j;
        return answer;
    }
}