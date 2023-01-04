package 입출력예제;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "서울 특별시";
        char gender = '남';
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        double aber = 0.0;
        //자바 스타일 ( 메소드를 오버로딩 하는 방식)
        System.out.println("======== Java Style Output======");
        System.out.print("Name : " + name + "\n");
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat));
        System.out.println("평균 : "+ ((double)(kor + eng + mat)/3));
        //c 언어 스타일 (서식지정자를 사용)
        // 서식지정자 :%d, %ld, %u, %f, %, 2f, %s, %c, %%, %b
        // 이스케이프시퀀스: \n \r \t \b \\
        System.out.printf("======== Java Style Output======\n");
        System.out.printf("이름 : &s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat)/3);




    }
}
