package 다형성기본;

public class ParentPoly {
    protected  int num; //프로텍티드 접근제한자는 동일한 패키지와 상속관계에서 접근을 허용
    public  void display(){
        System.out.println("부모 클래스 메소드");
    }
}
class  ChildPoly extends ParentPoly{
    private  int x = 100;
    public  ChildPoly(){}
    public  void  out(){
        System.out.println("부모의 protected num 필드 :" + num);
        System.out.println("자식 클래스의 메소드");
    }
    @Override // 해당 메소드가 오버라이딩 관계인지를 컴파일러가 컴파일시 문법 체크를 해주도록 설정
    public void display(){
        System.out.println("상속 받아 재정의한 메소드");

    }
}
