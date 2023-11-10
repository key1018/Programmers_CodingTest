class Solution {
    public String solution(int age) {
        String answer = "";
        for(int i = 0; i < (Integer.toString(age)).length(); i++){
            int num = (Integer.toString(age)).charAt(i) - '0';
            char c = (char)(num + 97);
            answer += c;
        }
        return answer;
    }
}