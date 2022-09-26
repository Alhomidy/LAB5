public class TEST_EXE2 {
    public static void main(String[] args) {
        EXE2 account=new EXE2(1000);
        account.deposit(500);
        account.withdraw(1000);
        account.addintrest(50);
        account.mystery(account,250);
        System.out.println(account.getbalance());
    }
}
