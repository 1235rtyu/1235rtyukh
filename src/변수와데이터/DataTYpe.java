package 변수와데이터;
public class DataTYpe {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0; // 같은 타입으로 여러개의 변수를 선언

        double num3 = 3.14;
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시" + minute + "분");
        NameCard nameCard = new NameCard();
        nameCard.name = "곰돌이사육사";
        nameCard.age = 30;

        System.out.println(nameCard);
    }
}
class  NameCard {
    String name;
    int age;
    String address;
    String phoneNumber;

}