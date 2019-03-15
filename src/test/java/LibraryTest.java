
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import bean.Animal;
import bean.Bird;
import service.XxxService;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class LibraryTest {
	@Autowired
	private Animal a;

	@Autowired
	private Bird b;

	@Autowired
	private XxxService service;

	// @Autowired
	// private XxxServiceImpl service;

	@Test
	public void testTransaction() {
		System.out.println(service);
		// System.out.println(service.update1());
	}

	@Test
	@Ignore
	public void testAutowired() {
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	@Ignore
	public void testSpring() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Animal.class);
		for (String s : app.getBeanDefinitionNames()) {
			System.out.println(s);
		}
		Animal a = app.getBean(Animal.class);
		System.out.println(a.getB());
		app.close();
	}
}
