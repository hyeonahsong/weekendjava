package org.song.myapp;

public class star05 {

    public static void main(String[] args) {

        // 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.


        int[] list = new int[10];

        // 랜덤 값 10번 줄 친구 만드는 for문.
        for(int i = 0; i < 10; i++) {
            // 1~10 사이의 숫자를 랜덤으로 줌.
            int randomNo = (int)(Math.random() * 10 + 1);
            list[i] = randomNo;
        }

        System.out.print("랜덤한 정수들: ");
        double avg = 0;
        for(int i = 0; i < list.length; i++) {
            avg += list[i];
            System.out.print(list[i] + "  ");
        }
        System.out.print("평균: " + avg / 10);
    }

}
