package jp.ac.uryukyu;

import jp.ac.uryukyu.ie.e235728.Gambling;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gambling test = new Gambling(100000,3);

        System.out.println(test.AllUsersMoney);

        test.bet(100000);
        test.bet(100000);

        System.out.println(test.AllUsersMoney);

        test.judge();

        System.out.println(Arrays.toString(test.resultList));

        System.out.println(test.share());


    }
}

