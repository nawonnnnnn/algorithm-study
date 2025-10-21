class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String oddStr = "";
        String evenStr = "";
        
        for(int num : num_list){
            if(num % 2 == 0){
                evenStr += num + ""; 
            }
            else {
                oddStr += num + "";
            }
        }
        
        answer = Integer.parseInt(oddStr) + Integer.parseInt(evenStr);
        
        return answer;
    }
}