package com.hp.dao.lxy;

import com.hp.entity.lxy.User;

public interface UserDao {
	//登录
	User selectE(String email);
	//注册
	int zhuce(String email,String username,String password);
}
