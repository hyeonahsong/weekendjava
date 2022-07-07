package org.song.myapp;

public class Ex07_1 {
    // 1~9까지의 숫자를 이차원배열에 랜덤하게 10개 넣고
    //6개는 0으로 채워넣기
    public static void main(String[] args) {
        // for문 활용하기!
        int[][] list = new int[4][4];


for(int i = 0; i < 10; i++) {
     int rnd1 = (int)(Math.random() * 4);
    int rnd2 = (int)(Math.random() * 4);
    int rnd3 = (int)(Math.random() * 9 + 1);

    if (list[rnd1][rnd2]== 0 ) {
        list[rnd1][rnd2] = rnd3;
    } // if
    else {
        i--;
    } // else
}// i for

        // while 활용하기
//        int[][] list = new int[4][4];
int flag = 0;

        while(flag < 10) {
            int rnd1 = (int)(Math.random() * 4);
            int rnd2 = (int)(Math.random() * 4);
            int rnd3 = (int)(Math.random() * 9 + 1);

            if (list[rnd1][rnd2] == 0) {
                list[rnd1][rnd2] = rnd3;
                flag--;
            } // if
        } // while


        // 출력
for(int i = 0; i < list.length; i++) {
    for(int j = 0; j < list[i].length; j++) {
        System.out.print(list[i][j] + " ");
    } // j for
    System.out.println();
} // i for
    } // main


}
