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
            System.out.println(">>> [EstudiantesWS] Conexión a MongoDB inicializada exitosamente.");
        } catch (Exception e) {
            System.err.println(">>> [EstudiantesWS] Error crítico al conectar a MongoDB: " + e.getMessage());
        }
    }

    @PreDestroy
    public void destroy() {
        if (this.mongoClient != null) {
            this.mongoClient.close();
            System.out.println(">>> [EstudiantesWS] Conexión a MongoDB cerrada limpiamente.");
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
            System.err.println("Error al listar estudiantes: " + e.getMessage());
            throw new RuntimeException("Error interno en el servidor de Base de Datos: " + e.getMessage());
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
            System.err.println("Error al insertar estudiante: " + e.getMessage());
            return "Error al insertar en la base: " + e.getMessage();
        }
    }
}