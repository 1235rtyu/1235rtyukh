package 메소드연습;

public class Sample {
    String name; //인스턴스 필드 (객체가 만들어질 때 함께 만들어짐)

    // 생성자 : 클래스 일므과 동일하고 반환 타입이 없음, 클래스가 객체로 생성될 때 자동으로 호출
    // 생성자의 주요 목적은 클래스 내부의 인스턴스 필드를 초기화 함.
    Sample(){
        name = "anonymous";
    }
    // 동일 이름의 생성자가 여려개 만들어 지면 생성자 오버로딩 관계가 만들어 진다.
    Sample(String name) {
        this.name =name; //

    }
    String getName(){
        return  name;
    }
    //접근제한자 붙이지 않으면 default 접근 제한자 특성을 가짐(동일 패키지 내에서만 접근 가능)
    int sum(int a, int b) {
        return a + b;// 메소드 호출 결과를 정수값을 반환
    }
    // 메소드의 매개변수는 일반적으로 개수가 정해져 있음. 경우에 딸 ㅏ개수를 알 수 없는 경우
    int sum(int ...values){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return  sum;
    }
    //매개변수도 없고 반환값도 없는 메소드이다
            void  say( ){
            System.out.println("안녕하세요>");
            }

            String  sayStr() {
        return "안녕하세요";
            }
}
