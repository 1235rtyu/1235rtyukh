package 참조타입;

public class RefType {
    public static void main(String[] args) {
        int x = 0;
        String str = null; // 참조타입의 변수 객체를 참조하지 않는다는 의미
        int[] intArray = null;
        Integer val = 0;
        int val2 = val; //  NullpointException
        System.out.println(val2);
    }
}
