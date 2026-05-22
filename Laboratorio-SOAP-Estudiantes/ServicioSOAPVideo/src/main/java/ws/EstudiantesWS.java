package ws;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "EstudiantesWS")
public class EstudiantesWS {

    private final String CONNECTION_STRING = "mongodb://localhost:27017";
    private final String DATABASE_NAME = "bd_clase";
    private final String COLLECTION_NAME = "coleccion3";
    
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    @PostConstruct
    public void init() {
        try {
            this.mongoClient = MongoClients.create(CONNECTION_STRING);
            this.database = mongoClient.getDatabase(DATABASE_NAME);
            this.collection = database.getCollection(COLLECTION_NAME);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PreDestroy
    public void destroy() {
        if (this.mongoClient != null) {
            this.mongoClient.close();
        }
    }

    @WebMethod(operationName = "listarEstudiantes")
    public List<String> listarEstudiantes() {
        List<String> lista = new ArrayList<>();
        try {
            for (Document doc : collection.find()) {
                lista.add(doc.toJson());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    @WebMethod(operationName = "insertarEstudiante")
    public String insertarEstudiante(
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "apellido") String apellido,
            @WebParam(name = "cedula") String cedula) {
        try {
            Document nuevoEstudiante = new Document("nombre", nombre)
                                        .append("apellido", apellido)
                                        .append("cedula", cedula);
            
            collection.insertOne(nuevoEstudiante);
            return "Estudiante guardado de forma exitosa.";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}