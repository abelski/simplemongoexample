package by.abelski;

import by.abelski.dao.UserDao;
import by.abelski.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.List;

/**
 * @author abelski
 */
public class RunnerUsingSpringDataWithoutImpl {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        final UserDao dao = (UserDao) context.getBean("dao");
        final List<User> jim = dao.getOtherUserDao().findByNameLike("JIM");
        System.out.println("jim="+jim);
    }
}
