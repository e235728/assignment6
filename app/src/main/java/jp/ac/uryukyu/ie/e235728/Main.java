package jp.ac.uryukyu.ie.e235728;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gambling test = new Gambling(100000,3);
        
        
        System.out.println("現在、"+ test.AllUsersMoney + "円が賭けられています。");
        //今、賭けられている金額の全て

        test.bet(100000);
        //自分が100000円を追加した。
        System.out.println("あなたは10000円を追加しました。");


        test.bet(100000);
        //同様に10000円を追加した。

        System.out.println("あなたは10000円を追加しました。");


        System.out.println("現在、" + test.AllUsersMoney + "円が賭けられています。");
        //現在、賭けられているお金の合計

        test.judge();
        //ランダムに設定した人数（現在の設定では、3人）分の勝ち負けがランダムに表示される。

        System.out.println(Arrays.toString(test.resultList));

        System.out.println("あなたは" + test.share() + "円を得ました。");


    }
}

