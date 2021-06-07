package com.ls.house.service;


import com.ls.house.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    // 写入数据
    void saveData(UserInfo userInfo) ;
    // ID 查询
    UserInfo selectById (Integer id) ;
    // ID 查询
    List<UserInfo> selectListById (Integer id) ;
    // 查询全部
    List<UserInfo> selectList() ;
}
