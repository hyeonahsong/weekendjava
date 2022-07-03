package org.song.myapp;

import java.util.Scanner;

public class star04 {

    // 배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이 각 몇 개로 변환되는지 예시와 같이 출력하라. 이때 반드시 다음 배열을 이용하고 반복문으로 작성하라.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
        System.out.print("금액을 입력하세요 >>> ");
        int money = sc.nextInt();

        for (int i = 0; i < unit.length; i++) {
            int omoney = money / unit[i];
            System.out.println(unit[i] + "원 짜리 : " + omoney);
            money = money % unit[i];
        }
    }
}
