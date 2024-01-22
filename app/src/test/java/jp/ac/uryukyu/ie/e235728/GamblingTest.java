package jp.ac.uryukyu.ie.e235728;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingTest {

    @Test
    public void testBet() {
        Gambling test = new Gambling(100000, 3);
        
        
        assertEquals(100000, test.AllUsersMoney);

        test.bet(50000);
        assertEquals(150000, test.AllUsersMoney);
        //betをしたらその分の金額が増えるはず

        test.bet(100000);
        assertEquals(250000, test.AllUsersMoney);
        //betの金額を増やしても、その分の金額が増える。

    }
    
    
    @Test
    public void testShare() {
        Gambling test = new Gambling(100000, 3);

        test.bet(10000);
        test.bet(20000);
        test.bet(30000);
        //仮に10000円、20000円、30000円ずつAllUsersMoneyを増やしたとき


        test.resultList = new boolean[]{true, false, false};
        assertEquals(152000,test.share());
        //勝ち負けを適当に設定

        
        test.resultList = new boolean[]{false, false, false};
        assertEquals(0.0, test.share());
        //勝ち負けを適当に設定

    }

    @Test
    void testRandom(){
        Gambling test = new Gambling(100000,3);

        test.resultList = new boolean[]{true,false,true};

        assertEquals(test.AllUsersMoney * test.returnRate / 2 , test.share());
    }
}


//このユニットテストはchatgptを参考