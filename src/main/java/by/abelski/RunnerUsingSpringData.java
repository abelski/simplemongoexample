package by.abelski;

import by.abelski.dao.UserDao;
import by.abelski.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

/**
 * @author abelski
 */
public class RunnerUsingSpringData {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        final UserDao dao = (UserDao) context.getBean("dao");
        final Collection<User> users = dao.getUsers();
        for (User user : users) {
            System.out.println("user="+user);
        }
    }
}
