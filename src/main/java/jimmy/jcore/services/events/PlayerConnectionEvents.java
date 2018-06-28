package jimmy.jcore.services.events;

import jimmy.jcore.Jcore;
import jimmy.jcore.services.UserPlayer;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.network.ClientConnectionEvent;

public class PlayerConnectionEvents {

    @Listener
    public void onJoin(ClientConnectionEvent.Join event){
        event.setMessageCancelled(true);

        new UserPlayer(event.getTargetEntity().getUniqueId());
    }

    @Listener
    public void onLeave(ClientConnectionEvent.Disconnect event){
        event.setMessageCancelled(true);
        Jcore.API.getServices().managerService.userManager.find(event.getTargetEntity().getUniqueId()).get().cleanUp();
    }

}
