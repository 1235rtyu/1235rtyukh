package 반복문;

public class WhileEx {
    public static void main(String[] args) {
        int treeHit = 0;
        while (true){
            treeHit++;
                    System.out.println("나무ㄷ를0" + treeHit + "번 찍었습니다");
                    if(treeHit == 999) {
                        System.out.println("나무가 넘어 갑니다");
                        break;
                    }
        }
    }
}
