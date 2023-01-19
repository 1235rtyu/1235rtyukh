package 다형성응용;

public class Product {
    int price;
    int bonusPoint;
}
class TV extends Product {
    TV() {
        this.price = 100;//상속 받은 필드의 값을 초기화
        this.bonusPoint = 10;
    }
}
class Audio extends  Product {
    Audio() {
        this.price = 120;
        this.bonusPoint =12;

    }
}
class Computer extends  Product{
    Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void  buy(Product p){ // 각 제품에 대한 부모 클래스 타입의 변수
        money -= p.price; //제품 구매시 제품 금액 만큼의 돈을 지불하는 코드
        bonusPoint += p.bonusPoint;// 제품 구매시 해당 포인트를 누적하는 코드
    }
    void  viewInfo(){
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " +bonusPoint);
    }
}