package jimmy.jcore.services;

import jimmy.jcore.services.scoreboard.Scoreboard;
import jimmy.jcore.services.scoreboard.ScoreboardPreset;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.living.player.Player;

import java.util.UUID;

public class UserPlayer extends User {

    private Scoreboard scoreboard;

    public UserPlayer(UUID uuid) {
        super(uuid);
    }

    public void initScoreboard(ScoreboardPreset preset){scoreboard = new Scoreboard(this, preset);}

    public Scoreboard getScoreboard() {
        return scoreboard;
    }

    public Player getPlayer(){
        return Sponge.getServer().getPlayer(uuid).get();
    }

    @Override
    public void cleanUp(){
        super.cleanUp();

        scoreboard.unregisterScoreboard();
    }
}
