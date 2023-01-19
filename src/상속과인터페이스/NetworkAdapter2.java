package 상속과인터페이스;

public interface NetworkAdapter2 {
    void  connect();
    default  void description(){ //예외적인 문법으로 인터페이스 내에서 구현부를 가질 수 있음
        System.out.println("자바 8에서 추가된 새로운 문법 입니다");

    }
}
