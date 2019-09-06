package cn.zhh.service;

import cn.zhh.entity.User;

/**
 * 用户服务
 * @author z_hh
 * @time 2019年1月9日
 */
public interface UserService {
	
	/**
	 * 根据id查询User
	 * @param id
	 * @return
	 */
	User getUserById(Long id);

}
