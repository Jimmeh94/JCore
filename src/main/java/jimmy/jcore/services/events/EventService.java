package jimmy.jcore.services.events;

import jimmy.jcore.Jcore;
import org.spongepowered.api.Sponge;

public class EventService {
    
    public static void init() {
        Sponge.getEventManager().registerListeners(Jcore.API, new PlayerConnectionEvents());
    }
}
