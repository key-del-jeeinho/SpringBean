import com.xylope.springbean.applicationcontext.GenericXmlApplicationContext;
import com.xylope.springbean.bean.BeanScope;
import com.xylope.springbean.bean.SpringBean;
import com.xylope.springbean.testbean.TestSimpleXmlBean;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SpringBeanTest {
    @Test
    public void testSimpleXmlBean() {
        TestGenericXmlApplicationContext context = new TestGenericXmlApplicationContext("testBean.xml");
        SpringBean bean = new SpringBean("simpleBean", null);
        bean.setBeanClass(TestSimpleXmlBean.class.getName());
        context.addBean(bean);

        System.out.println(context.getBean("simpleBean", TestSimpleXmlBean.class));
        assertTrue(context.getBean("simpleBean", TestSimpleXmlBean.class) instanceof TestSimpleXmlBean);
    }

    static class TestGenericXmlApplicationContext extends GenericXmlApplicationContext {
        public TestGenericXmlApplicationContext(String path) {
            super(path);
        }

        public void addBean(SpringBean bean) {
            beans.add(bean);
        }
    }
}
