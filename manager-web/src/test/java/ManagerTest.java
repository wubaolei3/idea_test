import com.wbl.dao.UsersDao;
import com.wbl.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: wbl
 * @Date: 2019/3/17
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersDao usersDao;

    @Test
    public void insertUserTest(){
        Users user = new Users();
        user.setUsername("admin");
        user.setUserage(29);
        usersDao.insertUser(user);

    }



}
