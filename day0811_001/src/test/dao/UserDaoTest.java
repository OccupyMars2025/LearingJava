package test.dao;

import org.junit.Test;

import cn.itcast.user.dao.UserDao;
import cn.itcast.user.domain.User;

public class UserDaoTest {

	@Test
	public void testFindByUsername() {
		UserDao userDao = new UserDao();
		User user = userDao.findByUsername("����");
		System.out.println(user);
	}
	
	@Test
	public void testAdd() {
		UserDao userDao = new UserDao();
		User user = new User();
		user.setPassword("zhangSan");
		user.setUsername("����");
		userDao.add(user);
		
		user.setUsername("����");
		user.setPassword("liSi");
		userDao.add(user);
	}
	
}
