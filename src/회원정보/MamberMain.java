package 회원정보;

import java.util.Scanner;

public class MamberMain {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setName(); //이름을 정장하는 메서드 호출
        memberInfo.setAge(); //나이를 저장하는 메서드 호출
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.viewInfo();
    }
}
