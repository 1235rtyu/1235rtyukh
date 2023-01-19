package 오버라이딩제약;
// 오버라이딩은 부ㅠ모가 가진 메서드를 재정의해서 사욜하는 것
//부모의 클래스가 실체가 있는 클래스이면 오버라이딩은 선택 사항 임.
//부몽의 클래스에서 메소드 구현 시 상속 받은 자식에서 오버라이딩을 할 수 없도록 금지 할 수 있음
public class FInalOverriding {
    public static void main(String[] args) {
        sportsCar sportsCar = new sportsCar("Ferrari");
        sportsCar.setTurbo(true);
        sportsCar.infoCar();
        sportsCar.breakPanel();

        ElectricCar electricCar = new ElectricCar("EV6");
        electricCar.setAutoDrv(true);
        electricCar.infoCar();
    }
    }
