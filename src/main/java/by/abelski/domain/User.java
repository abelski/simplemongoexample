package by.abelski.domain;

import com.mongodb.BasicDBObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Simple pojo for example
 *
 * @see by.abelski.RunnerUsingSpringData use anotations
 * @see by.abelski.RunnerWithDriver use getMongoObject for serialization. work but not cool
 *
 * @author abelski
 */
@Document(collection = "User")
public class User {
    @Id
    public String id;
    private Long version;

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
