package ScannerEx;

import java.util.Scanner;




public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte(); // 키보드 입력의 입력을 바이트형으로 변환
        short b = sc.nextShort();
        int c = sc.nextInt();
        char ch = sc.next().charAt(0); //문자열에서 첫번째 문자를 추출
        String s1 = sc.next(); // 문자열을 공백 단위로 입력 받음
        String s2 = sc.nextLine();

  }
}

