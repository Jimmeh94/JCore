package jimmy.jcore.services;


import jimmy.jcore.services.managers.ManagerService;

import java.util.UUID;

public class User {

    protected UUID uuid;

    public User(UUID uuid) {
        this.uuid = uuid;
        ManagerService.userManager.add(this);
    }

    public UUID getUuid() {
        return uuid;
    }

    public boolean isPlayer(){return this instanceof UserPlayer;}

    public void cleanUp() {
        ManagerService.userManager.remove(this);
    }
}
