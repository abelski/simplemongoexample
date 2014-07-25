package by.abelski.example;

import com.mongodb.BasicDBObject;

/**
 * @author abelski
 */
public class User {
    String name;
    Sex sex;

    public User(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public BasicDBObject getMongoObject(){
        final BasicDBObject basicDBObject = new BasicDBObject();
        basicDBObject.append("name", this.name);
        basicDBObject.append("sex", this.sex.toString());
        return basicDBObject;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
