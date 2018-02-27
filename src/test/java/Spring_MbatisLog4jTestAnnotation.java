import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_MbatisLog4jTestAnnotation {
    private ApplicationContext applicationContext;
@Before
    public void setup() {
    applicationContext= new ClassPathXmlApplicationContext("Springconfig.xml");
    }

@Test
    public void findUserByID ()throws Exception {
        UserMapper2 userMapper2=(UserMapper2) applicationContext.getBean("UserMapper2");
        User2 user2= userMapper2.findUserById(5);
        System.out.println(user2);
    }
}
