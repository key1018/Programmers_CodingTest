class Solution {
    public int[] solution(int n) {

        int[] array = new int[100];
        int index = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                array[index] = i;
                index++;
            }
        }
        
        int[] result = new int[index];
        for(int i =0; i < index; i++){
            result[i] = array[i];
        }
        
        return result;
        
    }
}