package 인터페이스코코아톡;

import 인터페이스네트워크.NetworkAdapter;

public interface NetAdapter {
    void  connect();
    void  send(String  msg);

}
class WiFi implements NetAdapter{
    @Override
    public void connect() {}
    @Override
    public void send(String msg) {
        System.out.println("WiFi >>" + msg);
    }
}
class FiveG implements NetAdapter{
    @Override
    public void connect() {}
    @Override
    public void send(String msg) {
        System.out.println("5G >>" + msg);
    }
}

