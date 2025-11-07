class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(int i = 0; i < number.length(); i++){
            int result = number.charAt(i) - '0';
            answer += result;
        }
        
        return answer % 9;
    }
}