public class Print{
    public static void main(String[] args) {
        Atm user = new Atm("Kia Hiatari",  250000, 8928);
        user.balance(8928);
        user.deposit(200000);
        user.withdrawl(8928, 200000000);
        user.changepin(8928);
        user.newpin(8928);
    }
}
