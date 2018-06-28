package jimmy.jcore.services;


import jimmy.jcore.Jcore;

import java.util.UUID;

public class User {

    protected UUID uuid;

    public User(UUID uuid) {
        this.uuid = uuid;
        Jcore.API.getServices().managerService.userManager.add(this);
    }

    public UUID getUuid() {
        return uuid;
    }

    public boolean isPlayer(){return this instanceof UserPlayer;}

    public void cleanUp() {
        Jcore.API.getServices().managerService.userManager.remove(this);
    }
}
