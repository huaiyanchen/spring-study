import com.chy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTest {
    @Test
    public void testUserService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
