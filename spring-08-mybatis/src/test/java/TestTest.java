import com.chy.Mapper.CityMapper;
import com.chy.dao.City;
import com.chy.service.CityService;
import com.chy.service.impl.CityServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestTest {
    @Test
    public void testSelectCity() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        CityMapper mapper = sqlSession.getMapper(CityMapper.class);
        List<City> cities = mapper.selectAll();
        for (City city : cities) {
            System.out.println(city);
        }
    }

    @Test
    public void testSelectCity2()  {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        CityMapper mapper = (CityMapper) context.getBean("CityServiceImpl");
        List<City> cities = mapper.selectAll();
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
