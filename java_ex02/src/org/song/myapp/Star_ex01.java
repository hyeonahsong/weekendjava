package org.song.myapp;

public class Star_ex01 {
    // 별 찍기
//    *
//            **
//            ***
//            ****
//            *****

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            } // j for
            System.out.println();
        } // i for
    } // main
}
