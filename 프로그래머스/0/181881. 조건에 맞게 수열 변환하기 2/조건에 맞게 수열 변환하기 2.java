import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while (true) {
            // 이전 상태의 배열을 복사
            int[] prevArr = arr.clone(); 
            
            // 조건에 맞게 배열의 원소 변환
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            
            // 변환 전후 배열 비교
            if (Arrays.equals(prevArr, arr)) {
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}
