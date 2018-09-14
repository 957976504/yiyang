package com.dc.mapper;

import com.dc.pojo.TbUserInfo;

import java.util.List;

public interface SearchFileMapper {
    List<TbUserInfo> getUserInfo();

    List<TbUserInfo> getInfoByName(String insName);

    List<TbUserInfo> getInfoByTel(String userTel);

}
