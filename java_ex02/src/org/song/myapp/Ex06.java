package org.song.myapp;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex06 {
//4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라.
//8 6 1 1
//7 3 6 9
//4 5 3 7
    //9 6 3 1
    public static void main(String[] args) {
        int[][] list = new int[4][4];


        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int ranno = (int)(Math.random() * 10 + 1);
                list[i][j] = ranno;
            }
            System.out.println();
        }

        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }

}
