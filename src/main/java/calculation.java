package jp.ac.uryukyu.ie.e235728;

public class BetRecorder {
    private double[] betAmounts;
    private int currentIndex;

    public BetRecorder(int maxBets) {
        this.betAmounts = new double[maxBets];
        this.currentIndex = 0;
    }

    public void recordBet(double betAmount) {
        if (currentIndex < betAmounts.length) {
            betAmounts[currentIndex] = betAmount;
            currentIndex++;
        } else {
            System.out.println("ベットの数が最大に達しました。");
        }
    }

    public double[] getBetAmounts() {
        return betAmounts;
    }
}

