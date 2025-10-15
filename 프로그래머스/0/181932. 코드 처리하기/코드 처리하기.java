class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0; // 시작 모드는 0

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                // mode 바꾸기
                mode = 1 - mode;
                continue; // 1은 ret에 추가하지 않음
            }

            if (mode == 0) {
                // idx가 짝수일 때만 추가
                if (i % 2 == 0) {
                    ret += c;
                }
            } else {
                // mode == 1, idx가 홀수일 때만 추가
                if (i % 2 == 1) {
                    ret += c;
                }
            }
        }

        // ret가 비어있으면 "EMPTY" 반환
        if (ret.equals("")) {
            return "EMPTY";
        }

        return ret;
    }
}
