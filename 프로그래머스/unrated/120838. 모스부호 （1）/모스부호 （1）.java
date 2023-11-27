class Solution {
    public String solution(String letter) {
        String[] morseList = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        
        String [] morse = letter.split(" "); // 공백으로 나눠져 있는 것을 morse에 넣음    
        String answer = "";       
        int asc = 97;
        for(String a : morse){
            for(int i = 0; i < morseList.length; i++){
                if(morseList[i].equals(a)){
                    answer += (char)(asc + i);
                } 
            }
        }
        return answer;
    }
}