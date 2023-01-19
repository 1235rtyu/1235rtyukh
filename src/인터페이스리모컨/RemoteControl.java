//package 인터페이스리모컨;
//// 인터페이스란?
////모든 필드는 자동으로 상수(final static)으로 변환 됩니다.
////모든 메소드는 자동으로 추상메소드가 됩니다.(public abstract 가 자동 추가 됨)
////디폴트 메소드 : 에외적으로 구현부를 가질 수 있으면 상속 받은 클래스에서 재정의 가능 합니다
////정적메소드를 포함 할 수 있습니다(정적메소드는 객체화 상관없도 인터페이스 타입으로 사용 됩니다.)
//public interface RemoteControl {
//    int MAX_VOLUME = 100;//
//    int Min_VOLUME = 0; // 자동으로 final static
//    void  turnOn(); //자동으로 public abstract 가 붙음
//    void  turnOff();
//    void  setVolume(int volume);
//    static  void changeBattery(){//인터페이스 이름으로 접근해야 되고 상속과는 무관
//        System.out.println("건저지를 교환 합니다");
//    }
//    void getInfo();
//    void setMute(boolean mute);{
//        if
//
//    }
//}
