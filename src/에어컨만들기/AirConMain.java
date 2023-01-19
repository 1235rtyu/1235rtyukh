package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in); // 에어컨을 켜기위해 콘솔 입력을 받음
        int elapsedTime = 0; //경과 시간을 계산
        boolean isSetTemp = false; // 온도가 변경 되어야 할 조건 확인
        System.out.println("에어컨을 켜시겠습니까(Yes/NO)");
        String isON = sc.next();//에어컨을 켜기 위한 문자열을 입력 받음
        if (isON.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirConState();
            while (true) {
                sleep(1000);
                elapsedTime++;
                switch (lgAirCon.getWindStep()) {
                    case 1:
                        if (elapsedTime >= 60) isSetTemp = true;
                        break;
                    case 2:
                        if (elapsedTime >= 30) isSetTemp = true;
                        break;
                    case 3:
                        if (elapsedTime >= 20) isSetTemp = true;
                        break;
                    default:
                }
                if (isSetTemp) {
                    if (lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if (lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }

                if (lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다");
                    break;
                }
            }
        }
    }
}
