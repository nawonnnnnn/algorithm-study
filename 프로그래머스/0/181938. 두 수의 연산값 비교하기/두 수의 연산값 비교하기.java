class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = String.valueOf(a) + String.valueOf(b);
        
        int abValue = Integer.parseInt(ab);
        int ab2Value = 2 * a * b;
        
        answer = abValue >= ab2Value ? abValue : ab2Value;
        
        return answer;
    }
}