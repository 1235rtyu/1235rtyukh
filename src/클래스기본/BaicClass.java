package 클래스기본;
// 클래스이름 참조 변수 = new 클래스 이름();
public class BaicClass {
    public static void main(String[] args) {
        Car gv90 = new Car("Gv90", "White","2023.01",230); // 클래스로 객체 생성
        Car sanrafe = new Car("sanrafe", "Gray","2023.01",210); // 클래스로 객체 생성
        Car kona = new Car("sanrafe", "Gray","2023.01",190); // 클래스로 객체 생성

        gv90.setName("GV90 Sports");
        gv90.name = ("GV90 깡통");
        gv90.viewCaar();
        sanrafe.viewCaar();
        kona.viewCaar();

    }

}


    //접근제한자가 default 인 클래스 생성(동일한 패키지 내에서 접근 가능)
    class Car{
    static String manufacture = "현대자동차"; //클래스 변수 (넓은 의미에서 필드이다.)
        String name;  // 인스턴스 필드 ( 클래스가) 객체로 만들어 질 때 객체의 갯수 만큼 생성 됨
        String color; //인스턴스 변수 (필드)
        String productYear;
        int maxSpeed;
        // 생성 : 클래스 이름과 동일하고 반환 타입 없다. void 조차 없다.
        // 생성자는 주로 개체 생성시 객체 내부의 필드를 초기화 하는 목적으로 사용 된다.
        //필드는 생성자의 매개변수로 전달 된다.(객체를 생성하는 곳에서...)
        Car(String name, String color, String year, int speed) {
            this.name = name; // 전달받은 매개 변수와 객체 내부의 필드의 이름이 같은 경우는 숨겨지 this 적어야 함
            this.color =color;
            productYear = year;
            maxSpeed = speed;

        }
        Car(){}
        //Setter 메소드 : 인스턴스의 값을 설정하는 메소드
        void  setName(String name) {
            this.name = name;
        }

        void  setColor(String colr) {
            this.color = colr;

        }
        void viewCaar(){
            System.out.println("제조사 :" + manufacture);
            System.out.println("이름 : " + name);
            System.out.println("출고 연도 : " + productYear);
            System.out.println("최고속도 :" + maxSpeed);
            System.out.println("----------------");
        }
    }






