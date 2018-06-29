package jimmy.jcore.services.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoService {

    private MongoClient client;
    private MongoDatabase database;
    private String username, password, ip, databaseName;

    public MongoService(String username, String password, String ip, String database) {
        this.username = username;
        this.password = password;
        this.ip = ip;
        this.databaseName = database;
    }

    public void openConnection(){
        try {
            MongoClientURI uri = new MongoClientURI("mongodb://" + username + ":" + password + ip);
            client = new MongoClient(uri);
            if (database == null) {
                database = client.getDatabase("aurelios");
            }
        } catch( Exception e){
            System.out.println(e.toString());
        }
    }

    public boolean isConnected(){
        return client != null;
    }

    public MongoDatabase getDatabase(){
        return database;
    }

    public void close() {
        //fire custom database close event

        client = null;
        database = null;
    }

    public MongoClient getClient() {
        return client;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public Document fetchEmbeddedDocument(Document document, String field) { //for reading a single, non-embedded integer
        return (Document)document.get(field);
    }

}
