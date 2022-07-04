package org.song.myapp;

public class Ex07 {

//4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하여 임의의 위치에 삽입하라.
//동일한 정수가 있어도 상관없다. 나머지 6개의 숫자는 모두 0이다. 만들어진 2차원 배열을 화면에 출력하라.
//7 1 9 0
//0 0 0 1
//4 4 4 0
//7 4 5 0

    public static void main(String[] args) {
        int[][] ints = new int[4][4];

//        int flag = 0;
//        while (flag < 10) {
//            int rnd1 = (int)(Math.random() * 4);
//            int rnd2 = (int)(Math.random() * 4);
//            int rnd3 = (int)(Math.random() * 10);

//            if(ints[rnd1][rnd2] == 0) {
//                ints[rnd1][rnd2] = rnd3;
//                flag++;
//            }
//        }


        for(int i=0; i<10; i++) {
            int rnd1 = (int)(Math.random() * 4);
            int rnd2 = (int)(Math.random() * 4);
            int rnd3 = (int)(Math.random() * 10);
            if(ints[rnd1][rnd2] == 0) {
                ints[rnd1][rnd2] = rnd3;
            } else {
                i--;
            }
        }


        for(int i=0; i<ints.length; i++) {
            for(int j=0; j<ints[i].length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }


    } // main
}
