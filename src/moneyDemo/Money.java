package moneyDemo;

import java.util.ArrayList;
import java.util.List;

public class Money {
    public static List<Integer> getChange(int payment, int cost) {
        int rest = 0;

        int thousand = 0;
        int fiveHundred = 0;
        int twoHundred = 0;
        int oneHundred = 0;
        int fiffty = 0;
        int twenty = 0;
        int ten = 0;
        int two = 0;
        int one = 0;
        int change = payment - cost;

        thousand = change / 1000;
        rest = change - thousand * 1000;
        fiveHundred = rest / 500;
        rest = rest - fiveHundred * 500;
        twoHundred = rest / 200;
        rest = rest - twoHundred * 200;
        oneHundred = rest / 100;
        rest = rest - oneHundred * 100;
        fiffty = rest / 50;
        rest = rest - fiffty * 50;
        twenty = rest / 20;
        rest = rest - twenty * 20;
        ten = rest / 10;
        rest = rest - ten * 10;
        two = rest / 2;
        rest = rest - two * 2;
        one = rest;

        List<Integer> changeList = new ArrayList<>();
        changeList.add(thousand);
        changeList.add(fiveHundred);
        changeList.add(twoHundred);
        changeList.add(oneHundred);
        changeList.add(fiffty);
        changeList.add(twenty);
        changeList.add(ten);
        changeList.add(two);
        changeList.add(one);

        return changeList;
    }
}
