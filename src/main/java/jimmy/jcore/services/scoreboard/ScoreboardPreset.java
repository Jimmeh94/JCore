package jimmy.jcore.services.scoreboard;

import jimmy.jcore.services.UserPlayer;
import org.spongepowered.api.text.Text;

import java.util.ArrayList;
import java.util.List;

public class ScoreboardPreset {

    protected static Text BLANK_LINE = Text.of(" ");

    private List<Text> lines = new ArrayList<>();
    private UserPlayer owner;
    private List<Text> oldSnapshot = new ArrayList<>();
    /*
     * First string should be the title
     * Second string begins the information to display
     * Max of 15 entries, starting at the 2nd string
     */

    public ScoreboardPreset(UserPlayer owner){
        this.owner = owner;
    }

    public void updatelines(){} //if lines need to be updated on a timer, event, etc

    public List<Text> getLines(){
        return lines;
    }

    public Text getLines(int i){
        return lines.get(i);
    }

    public void setlines(List<Text> strings){ //should only use when instantiating or needing to manually manipulate lines
        lines = strings;
    }

    public UserPlayer getOwner() {
        return owner;
    }

    public void takeSnapshot() {
        oldSnapshot = new ArrayList<>(lines);
    }

    public List<Text> getOldSnapshot() {
        return oldSnapshot;
    }
}
