import com.dfby.aop.component.EntityDao;
import com.dfby.component.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: Springday04
 * @Date: 2018/9/6 15:23
 * @Author: Mr.Zhang
 * @Description:
 */
public class TestCase {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = ac.getBean("bf",Product.class);
        product.show("前置通知");
    }
    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop.xml");
    }
    @Test
    public void test3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        EntityDao entityDao = ac.getBean("entityDao", EntityDao.class);
        entityDao.insert(null);
    }
}
