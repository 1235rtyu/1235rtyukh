package 타입변환;
// 타입 변환이란? 하나의 타입을 다른 타입으로 변경 하는는 것
// 묵시적 형변환(Auto): 컴파일러가 유리한 방향으로 형을 변경해주는 것
// 명시적 형변환 : 개발자가 의도한대로 형변환을 하는 것
// 메소드를 이용한 형변환 : Integer.parseInt(); 문자열을
// 친수 표현 : 16진수, 10진수. 8진수, 2진수
public class TypeEx1 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double rst1 = num1 / num2;  // 문제가 발생하는 코드
        double rst2 = (double)num1 / num2;  // 명시적 형변환과 목시적 현변환이 일어남
        double rst3 = 100+ 100.1;
        System.out.println(rst1);
        System.out.println(rst2);

        String poneeNumber = "01050064146";
        String name = "곰돌이사육사";

        int number = Integer.parseInt(poneeNumber);
        System.out.println(number);
        int var1 = 0b1010; // 2진수 = 10
        int var2 = 0267; // 8진수
        int var3 = 399;// 10진수
        int var4 = 0x100abcd; //16진수
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var1);
        System.out.println("var3 : " + var1);
        System.out.println("var4 : " + var1);

    }
}
