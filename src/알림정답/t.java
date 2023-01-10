package 알림정답;

import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 생성된 객체로 시간과 분을 입력 받음(24간제)
        System.out.println("시간입력 : ");
        int hour = sc.nextInt();
        System.out.print("분을 입력 : ");
        int minute = sc.nextInt();
        //변수를 만들어서 입력 받은 시간과 분을 모두 분으로 환산
        int calc = (hour * 60) + minute;
        //고력상항 : 환산한 시간이 45분 보다 적으면 별도의 계산이 필요
        if (calc < 45) {//분
            calc = (24 * 60) + minute; //하루의 시간을 분으로 환해서 더해줌
        }
        //창영이가 알려준 방법대로 시간을 45분 이전으로 돌림(45를 뺴줌)
        calc -= 45; // calc = calc - 45;
        //계산 결과를 시간과 분으로 출력하기 위해 다시 변환 후 출력
        System.out.printf("%d시 0%d분\n", (calc / 60), (calc % 60));


    }
}

