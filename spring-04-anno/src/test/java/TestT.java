import com.chy.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestT {
    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());

    }
}
