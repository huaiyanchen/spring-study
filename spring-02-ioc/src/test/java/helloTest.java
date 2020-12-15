import com.chy.hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class helloTest {
    @Test
    public void testHell0() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        hello hello = context.getBean("hello", hello.class);
        System.out.println(hello.getGetHello());
    }

    /**
     * 比较上下的区别 ————————————————————————————————————
     */
    @Test
    public void testHell1() {
        hello hello = new hello();
        hello.setGetHello("hepop");
        System.out.println(hello.getGetHello());
    }
}
