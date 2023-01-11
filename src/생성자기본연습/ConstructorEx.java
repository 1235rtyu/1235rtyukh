package 생성자기본연습;
// 생성자란? 클래스가 객체로 마늗ㄹ어 질 때 자동으로 (new 를 호출 할때)되며
// 생성자는 인스턴스 필드를 초기화하는 것이 주 목적이다.
// 생성자 만드는 규칙
// 1. 생성자는 클래스 이름과 같아야 함.
// 2. 반환 타입은 없고 접근제한자는 올 수 있으나 private 특별한 경우가 아니면 사용 안함
// 3. 하나의 클래스는 여려개의 생성자를 가질 수 있습니다. (단, 오버로딩 생성 규칙에 맞아야함)
public class ConstructorEx {
    public static void main(String[] args) {

    }
}


class  Car {
    String name;
    String year;
    String color;
    Car(){} // 아무것도 없는 생성자
    Car(String name){}
    Car(int type1, String year){}

    }
