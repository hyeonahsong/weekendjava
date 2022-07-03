package org.song.myapp;

public class ex01 {

    public static void main(String[] args) {
        // i는 0부터 99까지 반복하여 짝수만 더하거라
//        int num = 0;
//        for(int i = 0; i < 100; i++) {
//            if(i%2==0) {
//                num += i;
//                num = num + i;
//            }
//        }

//        int i = 0;
//        int num = 0;
//        while(i < 100) {
//            num += i;
//            i += 2;
//        }

        int i=0, num=0;
        do{
            num += i;
            i += 2;
        } while (i<100);



        System.out.println(num);
    }

}
