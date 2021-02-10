import com.xylope.springbean.applicationcontext.GenericXmlApplicationContext;
import com.xylope.springbean.testbean.TestSimpleXmlBean;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SpringBeanTest {
    @Test
    public void testSimpleXmlBean() {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("testBean.xml");
        assertTrue(context.getBean("simpleBean", TestSimpleXmlBean.class) instanceof TestSimpleXmlBean);
    }
}
