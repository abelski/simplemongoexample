package by.abelski.dao;

import by.abelski.domain.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author abelski
 */

@Repository
public class UserDao {
    @Resource(name = "mongoTemplate")
    MongoTemplate template;
    public Collection<User> getUsers(){
        return template.findAll(User.class);
    }
}
