package 문자열;

public class StringType {
    public static void main(String[] args) {
        String a = "hello:";
        String b = "java:";
        String c = "hello:";
        System.out.println(a.equals(b));// a의 문자욝허 b우ㅏ 뮨저욜 비교
        System.out.println(a.equals(c));
        System.out.println(a. equalsIgnoreCase("HELLO"));// 대소문자 구분 안함
        System.out.println(a == c);//이건 문자열의 내용을 비교하는 것이 아니고 문자열의 참조 즉 주소를 비교하는 것
        String d ="Hello java";
        // indexOf = 문자열에 특정 문자 혹은 문자열이 시작되는 인덱스를 리턴
//        System.out.println(d.indexOf("j"));
        // contains : 문자열에서 특정 문자열의 포함여부를 리턴
        System.out.println(d.contains("HELLO")); // 대소문자 구분 함
        // charAt : 문자열에서 튿정 위치의 문자를 리턴 함
        System.out.println(d.charAt(1));
        // replaceAll :문자열 중 특정 문자열을 ㅁ다른 문자열로 대체 할 대 사용
        String language = "Java, Pythone, C, C++, JavaScript, Kotlin, Swift";
        System.out.println(language.replaceAll( "JavaScript", "jet Brain"));
        // Substring : 문자열에서 특정 문자열을 뽑아 낼 때 사용
        String e = "Hello java";
        System.out.println(e.substring(6)); // 시작 인덱스 부터 끝까지 추출
        System.out.println((e.substring(1,4))); // 시작 인덱스 부터 종류 인데스 미만까지 추출
        // toUpperCase / tpLoweCase : 문자열을 모두 대문자 또는 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
        // trim : 문자열의 앞 뒤에 있는 공백 제거
        String str = "자바 프로그래밍   !!!!    ";
        System.out.println(str.trim()); // 앞과 뒤에만 공간 제거

        //문자열 포매팅이란? 문자열에 특정 문자를 삽입하는 방법 (삽입을 위해서는 서식이 필요)
        System.out.printf("자바 프로그램을 %s 합시다.\n","열심히");
        String newStr = "";
        //newStr = String.format("I eat &d apples. so I was sick for %s days",);
        System.out.println(newStr);

        //toCharArray() : 문자열을 문자 배열 반환
        String name = "곰돌이사육사";
        char[] arrName = name.toCharArray(); //문자열을 문자로 구성된 배열로 만듬
        System.out.println(name);
        System.out.println(arrName);


    }
}
