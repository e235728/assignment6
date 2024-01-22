package jp.ac.uryukyu.ie.e235728;


public class Gambling {
    public double betAmount ;
    public double AllUsersMoney;
    public double WinnerUsersMoney ;
    public double returnRate = 0.95; // 戻り率９５％
    public boolean result;
    public boolean[] resultList ;

    
    public Gambling(double _AllUsersMoney, int x){
        this.AllUsersMoney = _AllUsersMoney;
        //ここでプレイヤーの人数を設定
        resultList = new boolean[x];
        //今は場の賭け金を手動で設定しているが、プレイヤーがベットした合計で算出するのが望ましい。
    }
    
    public void bet(double betMoney){
        this.betAmount = betMoney;
        this.AllUsersMoney += betMoney;
        //betした金額をAllUsersMoneyに追加する。
    }
    
    public void judge(){
        for(int i = 0; i < resultList.length; i++){
            if (Math.random() < 0.5){
                this.resultList[i] = true;
            }
            else{
                this.resultList[i] = false;
            }
    //それぞれのプレイヤーについて、勝ちをtrue、負けをfalseとしてランダムに設定する。
        }       
    }

    public double share(){
        int winnerUsers = 0;
        for(int i =0;i < resultList.length;i++){
            if(resultList[i] == true){
                winnerUsers ++ ;
            }
            //勝った人の人数をカウントする。
        }

        if(resultList[0] == true){
            return AllUsersMoney * returnRate / winnerUsers ;
            //勝った人たちで全ての金額を分配する。
        }
        else{
            return 0.0;
            //リストの１番目が自分だと想定。
        }
    }
}
