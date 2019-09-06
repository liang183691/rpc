package cn.zhh.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import cn.zhh.annotation.RpcService;
import cn.zhh.entity.User;
import cn.zhh.service.UserService;

/**
 * 用户服务实现类
 * @author z_hh
 * @time 2019年1月9日
 */
@Service
@RpcService(interfaces = {UserService.class})
public class UserServiceImpl implements UserService {

	@Override
	public User getUserById(Long id) {
		User user = new User();
		user.setId(1L);
		user.setName("zhh");
		user.setSex(1);
		user.setCreateTime(new Date());
		
		return user;
	}

}
