package com.jin.service.user;

import com.jin.pojo.User;

public interface UserService {
    //用户登录
    public User login(String userCode, String pwd);

    //根据用户ID修改密码
    public boolean updatePwd(int id, String pwd);

    //查询记录数
    public int getUserCount(String username, int userRole);
}
