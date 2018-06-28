package jimmy.jcore.services.managers;

import jimmy.jcore.services.User;
import jimmy.jcore.services.UserPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserManager extends Manager<User>{

    public Optional<UserPlayer> findPlayer(UUID uuid){
        Optional<UserPlayer> give = Optional.empty();

        for(User user: this.objects){
            if(user.getUuid().equals(uuid) && user.isPlayer()){
                give = Optional.of((UserPlayer) user);
            }
        }

        return give;
    }

    public Optional<User> find(UUID uuid){
        Optional<User> give = Optional.empty();

        for(User user: this.objects){
            if(user.getUuid().equals(uuid)){
                give = Optional.of(user);
            }
        }

        return give;
    }

    public List<UserPlayer> getAllPlayers(){
        List<UserPlayer> players = new ArrayList<>();
        for(User user: this.objects){
            if(user.isPlayer()){
                players.add((UserPlayer) user);
            }
        }
        return players;
    }

    public List<User> getObjects() {
        return objects;
    }
}
