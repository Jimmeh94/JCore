package jimmy.jcore.services.messager;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColor;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an easy way to send paragraphs of texts to players using ServiceMessagerService
 * Child messages will be indented with bullet points by default
 */
public class Message {

    public static Builder builder(){return new Builder();}

    private Entry[] messages;
    private Player[] sendTo;

    private Message(Player[] sendTo, Entry... messages){
        this.messages = messages;
        this.sendTo = sendTo;
    }

    public Entry[] getMessages() {
        return messages;
    }

    public Player[] getSendTo() {
        return sendTo;
    }

    public static class Builder {

        private List<Player> sendTo = new ArrayList<>();
        private List<Entry> messages = new ArrayList<>();

        public Builder addReceiver(Player player){
            sendTo.add(player);
            return this;
        }

        public Builder addMessage(Text text){
            messages.add(new Entry(text, null));
            return this;
        }

        public Builder addMessage(Text text, MessagerService.Prefix prefix){
            messages.add(new Entry(text, prefix));
            return this;
        }

        public Builder addAsChild(Text text, TextColor bulletColor){
            messages.add(new Entry(text, MessagerService.Prefix.CHILD, bulletColor));
            return this;
        }

        public Message build(){
            return new Message(sendTo.toArray(new Player[sendTo.size()]), messages.toArray(new Entry[messages.size()]));
        }

    }

    public static class Entry{
        private Text text;
        private MessagerService.Prefix prefix;
        private TextColor bulletColorForChild;

        public Entry(Text text, MessagerService.Prefix prefix) {
            this.text = text;
            this.prefix = prefix;
        }

        public Entry(Text text, MessagerService.Prefix prefix, TextColor bulletColorForChild) {
            this.text = text;
            this.prefix = prefix;
            this.bulletColorForChild = bulletColorForChild;
        }

        public TextColor getBulletColorForChild() {
            return bulletColorForChild;
        }

        public Text getText() {
            return text;
        }

        public MessagerService.Prefix getPrefix() {
            return prefix;
        }
    }
}
