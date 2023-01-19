package 오버라이딩제약;

public class vehicle {
    protected int speed; //프로텍티드는 상속관계와 동일 패키지 내에서 접근 가능
    protected String color;
    protected String name;
    // 파이널은 최종 상태를 의미하며, 메소드에서 사용시 오버로딩이 불가 함을 의미 합니다
    final void accelerator(){
        System.out.println("차의 속돌를 증가 시킵니다");

    }
    final void  breakPanel(){

        System.out.println("차의 속도를 감소 시킵니다");
    }
}
     class sportsCar extends vehicle {
    Boolean isTurbo;
    sportsCar(String name){
            isTurbo = false; // 터보모드가 켜지면 차의 최고 속도를 증가 시키는 기능 상속 받은 기능이 아님
            speed = 200; //비클로 부터 상속 받음
            this.name = name; //생성자로 부터 이름을 입력 받아 인스턴스 필드의 초기갑으로 사용
            color = "Red";
        }
        int getSpeed() {//게터라고 부른다.
            if (isTurbo) return speed *= 1.2;
            return speed;
        }
        boolean getTurbo(){  //게터
            return isTurbo;
        }
        void  setTurbo(boolean x){
            isTurbo = x;
        }
        void  infoCar() {
            System.out.println("이름 : " + name);
            System.out.println("속도 " + getSpeed());
            System.out.println("색상 " + color);
            System.out.println("터보모드 :" + isTurbo);
        }
        }
        class  ElectricCar extends vehicle {
        boolean isAutoDrv;
        ElectricCar(String name){
            isAutoDrv = false;
            speed = 200;
            this.name = name;
            color = "White";

        }
        boolean getAutoDrv(){
            return isAutoDrv;

        }
        void  setAutoDrv(boolean autoDrv){
            isAutoDrv = autoDrv;
        }
        void  infoCar(){
            System.out.println("이름 : " + name);
            System.out.println("속도 : " + speed);
            System.out.println("색상 : " + color);
            System.out.println("자율주행 : " + isAutoDrv);

        }

        }




















