public class EXE2 {
    private double balance;

    public EXE2(){
        balance=0;
    }
    public EXE2(double initial){
        balance=initial;
    }

    public void mystery(EXE2 that,double amount){
        this.balance-=amount;
        that.balance+=amount;

    }
    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=balance)
            balance-=amount;
    }

    public void addintrest(double rate){
        balance+=(rate/100)*balance;
    }

    public double getbalance(){
        return balance;
    }
}

