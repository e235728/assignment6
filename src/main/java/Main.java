public class Main {
    public static void main(String[] args) {
        double betAmount = 10000;
        double AllUsersMoney = 10000000;
        double WinnerUsersMoney = 500000;
        double returnRate = 0.95; // 戻り率９５％
        double odds = AllUsersMoney * returnRate / WinnerUsersMoney ;//オッズ
       

        int selectedPlayer = 1;
        

        // １対１での結果を出すシュミレーション
        int matchResult = simulateMatch();

        if (selectedPlayer == matchResult) {
            double WinningMoney = betAmount * odds ;
            System.out.println(WinningMoney + "を得ました。");
        }  
    }
    private static int simulateMatch() {
        // 試合の結果を1or2でランダムに表す
        if (Math.random() < 0.5) {
            return 1;
        } else {
            return 2;
        }
    }   
}
