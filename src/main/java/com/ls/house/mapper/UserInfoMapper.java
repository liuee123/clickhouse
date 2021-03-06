package com.ls.house.mapper;

import com.ls.house.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    // 写入数据
    void saveData(UserInfo userInfo) ;
    // ID 查询
    UserInfo selectById (@Param("id") Integer id) ;
    // 查询全部
    List<UserInfo> selectList() ;
    List<UserInfo> selectListById (@Param("id") Integer id) ;
}
