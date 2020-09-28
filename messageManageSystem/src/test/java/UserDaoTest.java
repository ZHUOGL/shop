import com.messageManageSystem.dao.UserDao;
import com.messageManageSystem.dao.impl.UserDaoImpl;
import com.messageManageSystem.entity.User;
import org.junit.Test;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void testAddUser() {
        User user = new User("test", "123", 0, "1111@qq.com");
        int result = userDao.addUser(user);
        System.out.println(result);
    }

}
