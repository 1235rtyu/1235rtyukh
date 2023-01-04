package 나머지연산자;

import java.util.Scanner;

// 100의 자리 정수를 받아서 3개의 변수(100자리/10자리/1자리)에 대입하기
//365
// a=3
// b=6
// c=5
public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int num = sc.nextInt();
        int a,b,c;
        a = num / 100; //100으로 나눈 몫을 취한다.
        b = (num % 100) / 10;
        c = num % 10;
        System.out.print("100자리 : " + a + ",10자리 : " + b +" ,1의자리" + c );
    }

}
