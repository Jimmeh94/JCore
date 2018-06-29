package jimmy.jcore.services.scoreboard;

import jimmy.jcore.services.UserPlayer;
import jimmy.jcore.services.managers.ManagerService;

import java.util.Optional;
import java.util.UUID;

public class ScoreboardService {

    public void updateAllScoreboards(){
        for(UserPlayer player: ManagerService.userManager.getAllPlayers()){
            player.getScoreboard().updateScoreboard();
        }
    }

    public void updateScoreboard(UserPlayer player){
        player.getScoreboard().updateScoreboard();
    }

    public void updateScoreboard(UUID player){
        Optional<UserPlayer> opt = ManagerService.userManager.findPlayer(player);
        if(opt.isPresent()){
            opt.get().getScoreboard().updateScoreboard();
        }
    }

}
