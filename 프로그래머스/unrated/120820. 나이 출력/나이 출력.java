import java.time.LocalDate;
class Solution {
    public int solution(int age) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        return year - age;
    }
}