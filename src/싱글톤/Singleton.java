package 싱글톤;

public class Singleton {
    String name;
    int id;
    private  static Singleton singleton = new Singleton();
    private  Singleton() { // 생성자를 통해서 객체가 생성되지 않도록 접근제한을 설정
        name = "test";
        id =100;

    } //메소드 호출 시 반환 값으로 이미 만ㄷ어#
    static Singleton getSingleton(){
        return  singleton;
    }
}
