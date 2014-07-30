package by.abelski.dao;

import by.abelski.dao.api.IOtherUserDao;
import by.abelski.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author abelski
 */

@Repository
public class UserDao {
    @Autowired
    IOtherUserDao otherUserDao;

    @Resource(name = "mongoTemplate")
    MongoTemplate template;

    public Collection<User> getUsers(){
        return template.findAll(User.class);
    }

    public IOtherUserDao getOtherUserDao() {
        return otherUserDao;
    }

    public void setOtherUserDao(IOtherUserDao otherUserDao) {
        this.otherUserDao = otherUserDao;
    }
}
