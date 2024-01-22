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

        test.bet(100000);
        assertEquals(250000, test.AllUsersMoney);
    }

    @Test
    public void testShare() {
        Gambling test = new Gambling(100000, 3);

        test.bet(10000);
        test.bet(20000);
        test.bet(30000);

        // Simulate winning scenario
        test.resultList = new boolean[]{true, false, false};
        assertEquals(20000, test.share(), 0.01); // Allow a small margin of error for double comparison

        // Simulate losing scenario
        test.resultList = new boolean[]{false, false, false};
        assertEquals(0.0, test.share(), 0.01);
    }
}
