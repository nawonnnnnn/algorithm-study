package programmers.lv0.sumAngles;

// 일반적으로 두 선분이 이루는 각도는 한 바퀴를 360도로 하여 표현합니다.
//따라서 각도에 360의 배수를 더하거나 빼더라도 같은 각을 의미합니다. 예를 들면, 30도와 390도는 같은 각도입니다.
//주어진 코드는 각도를 나타내는 두 정수 angle1과 angle2가 주어질 때, 이 두 각의 합을 0도 이상 360도 미만으로 출력하는 코드입니다.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle%360);
    }
}
