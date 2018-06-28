package jimmy.jcore.services.scoreboard;

import jimmy.jcore.Jcore;
import jimmy.jcore.services.UserPlayer;

import java.util.Optional;
import java.util.UUID;

public class ScoreboardService {

    public void updateAllScoreboards(){
        for(UserPlayer player: Jcore.API.getServices().managerService.userManager.getAllPlayers()){
            player.getScoreboard().updateScoreboard();
        }
    }

    public void updateScoreboard(UserPlayer player){
        player.getScoreboard().updateScoreboard();
    }

    public void updateScoreboard(UUID player){
        Optional<UserPlayer> opt = Jcore.API.getServices().managerService.userManager.findPlayer(player);
        if(opt.isPresent()){
            opt.get().getScoreboard().updateScoreboard();
        }
    }

}
