package jimmy.jcore.services.economy;

public class EconomyService {

    private static boolean overdraft = true;
    private static String currencySymbol = "$";

    public static void sendMoney(Account sender, Account receiver, double amount){
        if(sender.canAfford(amount)){
            sender.withdraw(amount);
            receiver.deposit(amount);
            TransactionResult.SUCCESS.display(sender);
            TransactionResult.SUCCESS.display(receiver);
        } else {
            TransactionResult.NOT_ENOUGH_MONEY.display(sender);
        }
    }

    public static boolean canOverdraft() {
        return overdraft;
    }

    public static void setOverdraft(boolean overdraft) {
        overdraft = overdraft;
    }

    public static String getCurrencySymbol() {
        return currencySymbol;
    }

    public static void setCurrencySymbol(String c) { currencySymbol = c;
    }

}
