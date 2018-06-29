package jimmy.jcore;

import com.google.inject.Inject;
import jimmy.jcore.services.events.EventService;
import jimmy.jcore.services.managers.ManagerService;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartingServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "jcore",
        name = "JCore",
        description = "A Sponge based API with basic utilities.",
        url = "https://github.com/Jimmeh94/JCore",
        authors = {
                "Jimmy"
        }
)
public class Jcore {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStarting(GameStartingServerEvent event){

        EventService.init();
    }

    public Logger getLogger() {
        return logger;
    }
}
