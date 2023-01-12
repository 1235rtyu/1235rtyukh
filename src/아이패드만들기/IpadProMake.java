package 아이패드만들기;

import 문자열반전.StringReverse;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IpadProMake {
    int screen; //화면 크기 : 11인치, 12.9인치
    int color; // 색상 : 스페이스 레이 / 실버
    int memory; // 용량 : 128GB, 256GB, 512GB, 1TB
    int network; // 네트워크 : wi-fi,, wi-fi+Cellular
    String name; // 각인서비스 시 이름 저장
    String productDate; // 제품 생산 일자 (시리얼넘버를 만들 때 사용)
    String serialNum; // 제품 일련 번호 :ipad13128C2301121
    static int cnt = 0; // 클래스 변수 : 객체시 생성되지 않고 크래스 생성 시 만들어 짐
    IpadProMake(String name) {
        this.name = name;
        Date now = new Date(); // 현재의 시간정보를 가져오기 위해 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now);// 시간 정보 중"yyMMdd" 패턴으로 시간 정보 가져옴
        cnt++;  // 생성자는 객체가 만들어 질 때 호출 되므로 생선된 객체의 횟수를 확인하는 용도로 사용 할 수 있음
        productDate += cnt; // 연월일 + 생산댓수
    }
    //제품 구매에 대한 진행 여부를 무는 메뉴 만들기
    boolean continueOder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======ipad Prd 구입하기====");
        System.out.print("구입 하기 yes / 종류는 quit : ");
        String  isContinue = sc.next();
        if(isContinue. equalsIgnoreCase("yes")) return  true;
        return false;
    }
    //화면 크기 정하기
    void  setScreen(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택[1] 11인치, [2] 12.9인치 : ");
            screen = sc.nextInt();
            if(screen ==1 || screen ==2)  return;// 여이서 해당 메소드가 끝남
            System.out.println("디스플레이를 다시 선택 하세요");
        }
    }
    void  setColor(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("컬러 선택 [1] 스페이스 그레이. [2]실버")  ;
            color =sc.nextInt();
            if(color == 1 || color == 2) return;
            System.out.println("컬러를 다시 선택하세요. ");
            
        }
    }
    void setMemory(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 [1]128GB, [2] 256GB, [3] 512GB, [4]1TB :");
            memory =sc.nextInt();
            if(memory > 0 && memory <5 ) return;
            System.out.println("용량을 다시 선택 하세요");

        }
    }
    void  setNetwork(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("네트워크 선택 [1] wi-fi, [2] wwi-Cellular :");
            network =sc.nextInt();
            if(network == 1 || network ==2) return;
            System.out.println("네트워크를 다시 선택 하세요");
            
            
            
        }
    }
    void  setName(){
        Scanner sc = new Scanner((System.in));
        System.out.print("각인 서시브를 신청 하시겠습니까");
        String  service = sc.next();
        if(service.equalsIgnoreCase("Yes")){
            System.out.println("이름을 입력하세요 :");
            name = sc.next();
        }

    }
    void  setSerialNum() {
        String  screenStr = (screen == 1 ) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String  netStr = (network == 1 ) ? "w" : "C";
        serialNum = " iPad" + screenStr + memStr[memory] + netStr + productDate;
    }
    // 제품 구매가 완료 되면 출고까지 30초 대기 이후 출고 하기
    void inProductPad() throws InterruptedException {
        int cnt = 0;
        while (true) {
            sleep(300);
            cnt ++ ;
            System.out.println("<<iPad pro 제작중 : + [" + cnt + "% ] >>");
            System.out.println("\r");
            if(cnt >= 100) break;
        }
    }
    void  ProductPad(){
        final String[] scrType = {"", "11인치", "12.9센치"};
        final  String[] colorType = {"", "스페이스 그래이", "실버"};
        final  String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
        final  String[] netType = {"", "wi -fi", "wi-fi +Cellular"};
        System.out.println(" =====ipad Pro 가 출고 되었습니다");
        System.out.println("디스플레이 :" + scrType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 :" + memType[memory]);
        System.out.println("네트워크 :" + netType[network]);
        System.out.println(" 이름  "+ name);
        System.out.println("    일련번호 "+ serialNum);
        System.out.println("-------------------------------------");



    }


}


