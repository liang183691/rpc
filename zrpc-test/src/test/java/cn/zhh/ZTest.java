package cn.zhh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.zhh.controller.TestController;
import cn.zhh.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZTest {

	@Autowired
	private TestController testController;
	
	@Test
	public void test() {
		User user = testController.getUserById(1L);
		System.out.println(user);
	}
}
