package jimmy.jcore.services.economy;


import jimmy.jcore.services.messager.Message;
import jimmy.jcore.services.messager.MessagerService;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

public enum TransactionResult {

    SUCCESS,
    NOT_ENOUGH_MONEY;

    public void display(Account player){display(player, 0.0);}

    public void display(Account player, double amount){
        if(this == SUCCESS){
            MessagerService.sendMessage(Message.builder().addReceiver(player.getOwner().getPlayer())
                    .addMessage(Text.of(TextColors.GREEN, "Transaction was successful!"), MessagerService.Prefix.ECO).build());
        } else {
            MessagerService.sendMessage(Message.builder().addReceiver(player.getOwner().getPlayer())
                    .addMessage(Text.of(TextColors.RED, "You don't have enough money! Needed: " + amount + " Balance: " + player.getBalance()), MessagerService.Prefix.ECO).build());
        }

        player.showBalance();
    }

}
