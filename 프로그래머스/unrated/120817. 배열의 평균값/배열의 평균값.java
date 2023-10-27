class Solution {
    public double solution(int[] numbers) {
        int a = numbers.length;
        double sum = 0.0;
        if(a % 2 == 0){
            sum = (double)((double)numbers[a/2] + (double)numbers[a/2 - 1])/2;
        } else {
            sum = (double)numbers[a/2];
        }
        return sum;
    }
}