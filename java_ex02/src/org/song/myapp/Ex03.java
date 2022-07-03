package org.song.myapp;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // 정수 10개 입력 받아 배열에 저장한 후, 3의 배수만 출력하기
        Scanner sc = new Scanner(System.in);
        int[] list = new int[10];

        for(int i = 0; i < list.length; i++) {
            int no = sc.nextInt();
            list[i] = no;
        }

        System.out.print("3의 배수들: ");
        for(int j = 0; j < list.length; j++) {
            if(list[j] % 3 == 0) {
                System.out.print(list[j] + " ");
            }
        }
    }
}
