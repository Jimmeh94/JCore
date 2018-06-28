package jimmy.jcore.services.nodes.shapes;

import org.spongepowered.api.world.Location;

public interface Shape {

    boolean isWithin(Location location);

}
