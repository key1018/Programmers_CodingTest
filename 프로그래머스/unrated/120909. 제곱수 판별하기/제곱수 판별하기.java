class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i < n; i++){
            if((n / i) == i && (i * i) == n ) {
                answer = 1; break;
            }
            answer = 2;
        }
        return answer;
    }
}