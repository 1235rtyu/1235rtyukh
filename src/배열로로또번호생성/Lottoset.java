package 배열로로또번호생성;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Lottoset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int tmp = (int) ((Math.random() * 45) + 1);
            set.add(tmp);

        if(set.size() == 6) break;
    }
    System.out.println(set);
        }
    }