package 배열기타문법;

import java.util.Arrays;

public class BasicArrayEtc {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("외부에서 전달한 값이 없어 강제 종료 함");
            System.exit(0); // 프로그램을 강제 종료 시킴

        }
        String val1 = args[0];
        String val2 = args[1];
        int num1 = Integer.parseInt(val1); //입력 받은 문자열 정수로 변환
        int num2 = Integer.parseInt(val2);
        System.out.println("외부에서 전달하는 값 : " + (num1 + num2));

    }
}
