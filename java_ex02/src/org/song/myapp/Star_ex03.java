package org.song.myapp;

public class Star_ex03 {
// 별 찍기
//*****
//        #****
//        ##***
//        ###**
//        ####*

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("#");
            } // j for
            for(int k = 0; k < 5    -i; k++) {
                System.out.print("*");
            } // k for
            System.out.println();
        } // i for
    } // main
}
