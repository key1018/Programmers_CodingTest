class Solution {
    public int solution(int n) {
        int result = 1;
         int a = n % 7;
        if(n > 7){
            result = n / 7;
            if(a != 0){ // 나머지가 있는 경우
                result = (n / 7) + 1;
            }
        }
        return result;
    }
}