package 메소드연습;

import java.util.Scanner;

// 메소드 이름 규칙 : 변수 만드는 규칙과 동일(대 / 소문자, _, $, 숫자 사용 가증(숫자가 맨앞에 오면 안됨)
// camel 표기번 사용
// 접금제한자 반환타입 메소드이름(매개변수목록) { 구현부;, return}
public class ClassMethod {
    public static void main(String[] args) {
          Sample sample = new Sample(); //클래스 내에 생성자가 없으면 기본 생성자가 호출 됨
        Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int rst = sample.sum(n1, n2);
            System.out.println(rst);
            sample.say();
            //System.out.println(Sample.sayStr());
    }
}
