class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string; // HelloWorl, ProgrammerS123
        
        if(my_string.length() > answer.length()){ //10 > 9
            answer += my_string.substring(answer.length()); //
        }
        return answer;
    }
}