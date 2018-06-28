package jimmy.jcore.services.managers;

import jimmy.jcore.services.mongo.MongoService;
import jimmy.jcore.services.nodes.BlankNode;
import jimmy.jcore.services.nodes.Node;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.world.Location;

import java.util.Optional;
import java.util.UUID;

public class NodeManager extends Manager<Node> {

    private static Node DEFAULT_NODE;

    public static void init(String defaultNodeName){
        DEFAULT_NODE = new BlankNode(Text.of("Wilderness"));
    }

    public void load(){
        MongoService.loadData(MongoService.COLLECTION_NODES);
    }

    public Optional<Node> findNode(Location location){
        Optional<Node> give = Optional.empty();
        for(Node node: objects){
            if(node.isWithin(location)){
                give = Optional.of(node);
                break;
            }
        }

        if(!give.isPresent()){
            give = Optional.of(DEFAULT_NODE);
        }
        return give;
    }

    public Optional<Node> findNode(UUID uuid) {
        for(Node node: objects){
            if(node.getUuid().compareTo(uuid) == 0){
                return Optional.of(node);
            }
        }
        return Optional.empty();
    }
}
