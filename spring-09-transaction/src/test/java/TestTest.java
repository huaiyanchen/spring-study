import com.chy.mapper.CityMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTest {
    @Test
    public void testTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        CityMapper cityServiceImpl = context.getBean("CityServiceImpl", CityMapper.class);
        System.out.println(cityServiceImpl.selectAll());

    }
}
