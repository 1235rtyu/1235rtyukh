package 디형성응용2;

import java.util.Scanner;

public class PolyCar {
    public static void main(String[] args) {
        Driver driver = new Driver("우영우");
        SportsCar sportsCar = new SportsCar();
        Bus bus =new Bus();
        Truck truck = new Truck();
        Scanner sc = new Scanner(System.in);
        System.out.println("운전하고 싶은 차를 선택 1 스포츠 2 버스 3 트럭 ");
         int selCar = sc.nextInt();
         switch (selCar){
             case 1 : driver.driver(sportsCar);break;
             case 2 : driver.driver(bus); break;
             case 3: driver.driver(truck); break;
         }
    }
}
