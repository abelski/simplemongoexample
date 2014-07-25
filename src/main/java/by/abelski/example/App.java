package by.abelski.example;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Simple example using Mongo Db with mongo driver
 *
 * @author artyr
 * @see /www.mkyong.com/mongodb/java-mongodb-hello-world-example/
 */
public class App {
    public static void main(String[] args) {
        try {
            final MongoClient mongo = new MongoClient("localhost", 27017);
            final DB db = mongo.getDB("test");
            final DBCollection userCollection = db.getCollection("User");
            final int size = userCollection.find().size();

            System.out.println("size="+size);
            final User bob = new User("BOB", Sex.MALE);
            List<DBObject> dbObjects = new ArrayList<DBObject>(10000000);

            System.out.println("Date()=" + new Date());
            for (int i = 0; i < 10000000; i++) {
                dbObjects.add(bob.getMongoObject());
            }
            System.out.println("start inserting ");
            System.out.println("Date()=" + new Date());
            userCollection.insert(dbObjects);
            System.out.println("END Date()=" + new Date());
            System.out.println("size="+size);

        } catch (Exception e) { //not best practice, but it's Example!
            e.printStackTrace();
        }
    }
}
