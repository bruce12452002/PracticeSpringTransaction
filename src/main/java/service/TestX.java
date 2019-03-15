package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestX {
	@Autowired
	private XxxServiceImpl service;

	@Test
	public void testTransaction() {
		System.out.println("測試同個package，也就是update1使用非public，結果為一定要public，事務才有作用");
		System.out.println(service.update1());
	}
}
