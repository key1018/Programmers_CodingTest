class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        // for(int i = 0; i < my_string.length(); i++){
        //     if(i == num1) {
        //         answer += my_string.charAt(num2) + "";
        //     } else if (i == num2) {
        //         answer += my_string.charAt(num1) + "";
        //     } else {
        //         answer += my_string.charAt(i) + "";
        //     }
        // }
        
        char [] c = my_string.toCharArray();
        
        c[num1] = my_string.charAt(num2);
        c[num2] = my_string.charAt(num1);
        
        answer = String.valueOf(c);
        
        return answer;

    }
}