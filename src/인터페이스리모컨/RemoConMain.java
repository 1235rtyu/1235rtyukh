//package 인터페이스리모컨;
//
//import java.util.Scanner;
//
//public class RemoConMain {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("제품을 선택 하세요 [1]TV [2] Audio");
//        int sel = sc.nextInt();
//        RemoteControl rc;
//        if(sel ==1){
//            rc = new Television();
//            rc.turnOn();
//            rc.setVolume(20);
//            rc.getInfo();
//            rc.setMute(true); // 디폴트 메소드

//        }else {
//            rc = new Audio();
//            rc.turnOn();
//            rc.setVolume(120);
//            rc.getInfo();
//            rc.setMute(true); //디폴트 메소드이고 부모에서 만든 메소드 사용
//        }
//            RemoteControl. changeBattery(); // 인터페이스 소속의 메소드
//    }
//}
