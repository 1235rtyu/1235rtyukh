package 상근이알람;

import java.util.Scanner;

// 상근이라는 친구는 매일 학교를 지각 합니다
//창영이라는 친구가 상근이에게 지각하지 않는 방법을 알려 줍니다
//시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정되도록 함
//24시간제
public class Alarmset {
    public static void main(String[] args) {
        // 시간을 입력 받기 위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 생성된 객체로 시간과 분을 입력 받음(24간제)
        System.out.println("시간을 입력하세요 : ");
        int hour = sc.nextInt();
        System.out.println("분을 입력하세요 : ");
        int minute = sc.nextInt();


        //변수를 만들어서 입력 받은 시간과 분을 모두 분으로 환산
        int a = hour * 60; //시간
        int b = minute -45; //분

        //고력상항 : 환산한 시간이 45분 보다 적으면 별도의 계산이 필요
        if (b <= 60) {
            b = 1440 + b;
            int c = b / 60;
            int d = b % 60;
            System.out.printf("알람 시간은 :%d시 %d분", c, d);
        }else{
            int c = b / 60;
            int d = b % 60;
            System.out.printf("알람 시간은 :%d %분", c,d);
        }


        //창영이가 알려준 방법대로 시간을 45분 이전으로 돌림(45를 뺴줌)


        //계산 결과를 시간과 분으로 출력하기 위해 다시 변환 후 출력


    }
}
