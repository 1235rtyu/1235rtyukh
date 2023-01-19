package 에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

//기능 설계
// 전원 ON/OFF 기능
// 온도 설정 가능(1도)
// 현재 온도 표시 가능
// 냉방기  ON/OFF기능
// 난방기  ON/OFF rlsmd
// 바람 세기 설정 기능 1 2 3 단계
// 설정 조건 및 동작
// 설정된 온도에 따라 온도 조절 가능 (60 30 20) 주기로 온도 변경
// 에어컨의 동작 센서로 특정 문자를 입력 받아 동작 시킴
// 현재 온도 표시를 위해 캘린터 API를 이용해서 해당 달의 적절한 온도를 가져오도록 구현
// 현재 온도와 설정 온도가 같아지면 자동 종료
public class AirCon {
    boolean isPower; // 전원 ON/OFF
    private int setTemp; // 온도 설정 기능
    private int currTemp;
    private boolean isCooler;
    private boolean isHeater;
    private int windStep;
    public AirCon(){
        final  int[] monthTemp = {-5, 3, 8, 14, 22, 27, 31, 30, 22, 18 ,7, 2};
        Calendar now = Calendar.getInstance();
        int month =now.get(Calendar.MONTH);
        currTemp = monthTemp[month];

        setTemp = 18;
        isCooler =false;
        isHeater = false;
        windStep = 1;

    }
    //에어컨의 온도가 변경 될 때 화면 출력
    public  void  airConInfo(){
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler)  ? "ON" : "OFF";
        final  String[] windStr = { "", "1단계", "2단계", "3단계"};
        System.out.println("========정보=============");
        System.out.println("전원 : "  + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 " + setTemp);
        System.out.println("히터 :" + heaterStr);
        System.out.println(" 쿨러 :" + coolerStr);
        System.out.println(" 바람세기 : " + windStr[windStep]);
    }
    // 에어컨에 대해 온돠 바람세기 설정, 설정 이후 조건에 따라 히터 또는 쿨러를 켬
    public  void  setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가 "+currTemp + "입니다");
        System.out.print("온도를 설정 하세요 ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + "입니다");
        System.out.print("바람 세기를 설정하세요. [1단]/[2단]/[3단] :") ;
        windStep =sc.nextInt();
        if(currTemp > setTemp) {// 현재가 더운 상태
            System.out.println("Cooler 가 동작 합니다");
            isCooler = true;
            isHeater = false;
        }else  if(currTemp < setTemp){// 현재가 추운 상태
            System.out.println("Heater 가 동작 합니다");
            isCooler = false;
            isHeater =true;
        }else {
            isCooler = false;
            isHeater = false;
        }

    }
    public  void  setPower(boolean power)  {
        isPower = power;
    }
    public int getWindStep() {
        return  windStep;
    }
    public  boolean isHeater() {
        return  isHeater;
    }
    public boolean isCooler(){
        return  isCooler;
    }
    public  void  setCurrTemp(int n){
        currTemp += n;
    }
    public  int getCurrTemp(){
        return  currTemp;
    }
    public  int getSetTemp(){
        return setTemp;
    }
}

















































