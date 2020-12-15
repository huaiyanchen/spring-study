import com.chy.dao.UserDao;
import com.chy.dao.UserDaoImpl;
import com.chy.dao.UserDaoMyImpl;
import com.chy.service.UserDaoService;
import com.chy.service.UserDaoServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void testService() {
        UserDaoServiceImpl userDaoService = new UserDaoServiceImpl();
        //userDaoService.setUserdao(new UserDaoMyImpl());
        userDaoService.setUserDao(new UserDaoImpl());
        userDaoService.getName();
    }

    @Test
    public void testService2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDaoServiceImpl user = (UserDaoServiceImpl) context.getBean("serviceImpl");
        user.getName();
    }
}
