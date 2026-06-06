class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        int[] answer = new int[size];
        
        int idx = 0;        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[idx++] = arr[i] / 2;
            } else if(arr[i] < 50 && arr[i] % 2 != 0){
                answer[idx++] = arr[i] * 2;
            } else{
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}