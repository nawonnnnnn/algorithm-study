import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        // 1. 네 개 다 같을 때
        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        }

        // 2. 세 개 같을 때
        if (dice[0] == dice[2]) { // 앞 세 개 같음
            return (int)Math.pow(10 * dice[0] + dice[3], 2);
        }
        if (dice[1] == dice[3]) { // 뒤 세 개 같음
            return (int)Math.pow(10 * dice[3] + dice[0], 2);
        }

        // 3. 두 개씩 같은 경우
        if (dice[0] == dice[1] && dice[2] == dice[3]) {
            return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        }

        // 4. 두 개만 같은 경우
        if (dice[0] == dice[1]) return dice[2] * dice[3];
        if (dice[1] == dice[2]) return dice[0] * dice[3];
        if (dice[2] == dice[3]) return dice[0] * dice[1];

        // 5. 전부 다 다름
        return dice[0];
    }
}
