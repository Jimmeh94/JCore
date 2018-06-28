package jimmy.jcore.services.nodes;

import jimmy.jcore.services.nodes.shapes.Shape;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.world.Location;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Node {

    private Text displayName;
    protected Shape shape;
    protected UUID uuid;
    protected List<Node> children = new CopyOnWriteArrayList<>();

    public Node(Text displayName, Shape shape) {
        this.displayName = displayName;
        this.shape = shape;
        uuid = UUID.randomUUID();
    }

    public Node(Text displayName, Shape shape, UUID uuid) {
        this.displayName = displayName;
        this.shape = shape;
        this.uuid = uuid;
    }

    public void loadChildren(Node... nodes){
        if(nodes != null){
            Collections.addAll(this.children, nodes);
        }
    }

    public UUID getUuid() {
        return uuid;
    }

    public Text getDisplayName() {
        return displayName;
    }

    public Shape getShape() {
        return shape;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node poi) {
        children.add(poi);
    }

    public boolean isWithin(Entity player) {
        return isWithin(player.getLocation());
    }

    public boolean isWithin(Location location){
        if (shape.isWithin(location)) {
            return true;
        } else {
            for (Node node : children) {
                if (node.getShape().isWithin(location)) {
                    return true;
                }
            }
            return false;
        }
    }

    public Optional<Node> getContainingArea(Entity p){
        return getContainingArea(p.getLocation());
    }

    public Optional<Node> getContainingArea(Location location) {
        Optional<Node> give = Optional.empty();

        if(shape.isWithin(location)){
            give = Optional.of(this);

            /**
             * This will narrow down the area to the "smallest" child
             */
            for(Node node : children){
                if(node.getShape().isWithin(location)){
                    return Optional.of(node);
                }
            }
        }

        return give;
    }
}
