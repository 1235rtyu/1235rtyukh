package 인터페이스코코아톡;
//코코아 톡은 우리가 만들어야 부분
//send() 기능이 호출되면 적절한 네트워크가 연결되 입력 메세지를 수신할 대상자에게 전달하는 형태
import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTok cocoaTok = new CocoaTok("2NE1");
        cocoaTok.writeMsg("오늘 춥죠");
        NetAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]WiFi [2]5G");
        int sel = sc.nextInt();
        if(sel ==1){
            adapter = new WiFi();
        }else
            adapter = new FiveG();
            cocoaTok.send(adapter);


    }
}
