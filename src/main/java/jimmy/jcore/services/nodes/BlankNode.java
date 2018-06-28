package jimmy.jcore.services.nodes;

import jimmy.jcore.services.nodes.shapes.Shape;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.world.Location;

import java.util.Optional;

/**
 * This is a 'blank' node with no other functionality other than displaying a name.
 * Essentially, use this as the "wilderness".
 */

public class BlankNode extends Node {

    public BlankNode(Text displayName) {
        super(displayName, null);
    }

    @Override
    public Optional<Node> getContainingArea(Entity p) {
        return Optional.of(this);
    }

    @Override
    public boolean isWithin(Entity player) {
        return true;
    }

    @Override
    public boolean isWithin(Location location) {
        return true;
    }

    @Override
    public Optional<Node> getContainingArea(Location location) {
        return Optional.of(this);
    }

    @Override
    public void addChild(Node poi) {

    }
}
