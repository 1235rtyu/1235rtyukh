package 참조타입확인;

public class RefType {
    public static void main(String[] args) {
        String name1 = "진부연";
        String name2 = "진부연";
        String name3 = new String("진부연");
        if(name1 == name3){
            System.out.println("두개의 이름에 대한 참조가 같음");
        }else {
            System.out.println("두개의 이름에 대한 참조가 다름");
        }
        if(name1.equalsIgnoreCase(name3)){
            System.out.println("두개의 이름의 내용이 같음");
        }else {
            System.out.println("두개의 이름의 내용이 다름");
        }
    }
}
