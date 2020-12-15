import com.chy.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
    @Test
    public void testCon() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person", Person.class);
        System.out.println(person == person2);
    }
}
