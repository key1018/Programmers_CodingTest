class Solution {
    public int solution(int hp) {
        int top = hp / 5;
        int mid = (hp - (5 * top)) / 3;
        int bot = (hp - (5 * top) - (3 * mid)) / 1;
        return top+mid+bot;
    }
}