package dev.clayton.mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;

import javax.print.Doc;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://kevin:y0kOa0uAmUWg3EVz@mongodb-presentation-db.2klu5v1.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        try(final MongoClient mongoClient = MongoClients.create(settings)) {
            reset(mongoClient);

            listAllDatabases(mongoClient);
            step2(mongoClient.getDatabase("test"));
        } catch(final Exception exception) {
            exception.printStackTrace();
        }
    }

    /***
     * Weiterführung der Main, Aufteilung in Form von Stufen aufgrund von Übersichtlichkeit
     * @param mongoDatabase
     */
    private static void step2(final MongoDatabase mongoDatabase) {
        // Alle Collections in einer Datenbank ausgeben
        listAllCollectionsInDatabase(mongoDatabase);
        final MongoCollection<Document> collection = mongoDatabase.getCollection("test");

        // Alle Datensätze anzeigen
        listAllDocumentsInCollection(collection);

        // Neuen Datensatz hinzufügen
        Document document = new Document();
        document.append("beispiel", "Eintrag");
        document.append("creation_date", System.currentTimeMillis());
        document.append("random_number", new Random().nextInt());
        collection.insertOne(document);
        System.out.println("Neuen Datensatz hinzugefügt: " + document);
        System.out.println();

        // Datensätze neu anzeigen
        listAllDocumentsInCollection(collection);

        // Spezifischen Eintrag finden
        final Document foundDocument = collection.find(Filters.eq("beispiel", "Eintrag")).first();
        System.out.println("Gefundenes Dokument: " + foundDocument);
        System.out.println();

        // Nicht existenten Eintrag finden:
        System.out.println("Nicht existenter Eintrag: " + collection.find(Filters.eq("beispiel", "Test")).first());
        System.out.println();

        // Eintrag löschen
        collection.deleteOne(foundDocument);
        System.out.println("Eintrag gelöscht: " + foundDocument);

        // Datensätze neu anzeigen
        listAllDocumentsInCollection(collection);

        // Datensatz neu hinzufügen
        collection.insertOne(foundDocument);
        System.out.println("Datensatz neu hinzugefügt: " + foundDocument);
        System.out.println();

        // Datensatz noch Filter löschen
        final DeleteResult deleteResult = collection.deleteOne(Filters.eq("beispiel", "Eintrag"));
        System.out.println("Eintrag gelöscht: " + deleteResult.wasAcknowledged() + " (Anzahl: " + deleteResult.getDeletedCount() + ")");
        System.out.println();

        // Datensätze neu anzeigen
        listAllDocumentsInCollection(collection);

    }

    /*=----------------------------------------------------------------=*/

    /***
     * Gibt alle Datenbanken in einer Datenbank-Instanz aus
     * @param mongoClient Datenbank-Client Instanz
     */
    private static void listAllDatabases(final MongoClient mongoClient) {
        System.out.println("Alle Datenbank in der MongoDB-Instanz");
        for (Document database : mongoClient.listDatabases()) {
            System.out.println(database);
        }
        System.out.println();
    }

    /***
     * Gibt alle Collections in einer Datenbank aus
     * @param database Die ausgewählte Datenbank in der Instanz
     */
    private static void listAllCollectionsInDatabase(final MongoDatabase database) {
        System.out.println("Alle Collections in der Datenbank: " + database.getName());
        for (String name : database.listCollectionNames()) {
            System.out.println(name);
        }
        System.out.println();
    }

    private static MongoIterable<Document> getAllDocumentsInCollection(final MongoCollection<Document> mongoCollection) {
        return mongoCollection.find();
    }

    private static void listAllDocumentsInCollection(final MongoCollection<Document> mongoCollection) {
        System.out.println("Alle Daten in der Collection: " + mongoCollection.getNamespace().getFullName());
        for (Document document : getAllDocumentsInCollection(mongoCollection)) {
            System.out.println(document);
        }
        System.out.println();
    }

    /***
     * Setzt eine Datenbank zurück (DEV)
     * @param mongoClient Datenbank-Client Instanz
     */
    private static void reset(final MongoClient mongoClient) {
        mongoClient.getDatabase("test").getCollection("test").drop();
        mongoClient.getDatabase("test").createCollection("test");
        mongoClient.getDatabase("test").getCollection("test").insertOne(new Document().append("test", "test"));
        System.out.println("Datenbank zurückgesetzt!");
    }

}
