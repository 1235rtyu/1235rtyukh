package 인터페이스코코아톡;

public class CocoaTok {
    public String to; //상대방 이름
    public String msg; //전달할 메세지
    public CocoaTok(String name){
        to = name;
    }
    public void  writeMsg(String msg){
        this. msg = to + " : " + msg;
    }
    public void  send(NetAdapter na){
        na.send(msg);

    }
}
