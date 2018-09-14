package com.dc.service;


import com.dc.pojo.TbUserInfo;

import java.util.List;

public interface FileManagementService {
    /**
     * 显示所有用户信息
     * @return 用户信息
     */
    List<TbUserInfo> getUserInfo();
    /**
     * 根据姓名查询用户信息
     * @param insName 用户姓名
     * @return 用户信息
     */
    List<TbUserInfo> getUserInfoByName(String insName);

    /**
     * 根据电话号码查询用户姓名
     * @param userTel 用户电话号码
     * @return 用户新消息
     */
    List<TbUserInfo> getUserInfoByTel(String userTel);

}
