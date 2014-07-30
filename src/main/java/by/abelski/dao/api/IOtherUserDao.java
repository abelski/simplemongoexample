package by.abelski.dao.api;


import by.abelski.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author abelski
 */
@Repository
public interface IOtherUserDao extends MongoRepository<User, String> {
    List<User> findByNameLike(String name);
}
