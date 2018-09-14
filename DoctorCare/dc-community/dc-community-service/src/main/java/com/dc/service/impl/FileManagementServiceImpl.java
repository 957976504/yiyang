package com.dc.service.impl;

import com.dc.mapper.SearchFileMapper;
import com.dc.pojo.TbUserInfo;
import com.dc.service.FileManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FileManagementServiceImpl implements FileManagementService {
    @Autowired
    private SearchFileMapper searchFileMapper;

    @Override
    public List<TbUserInfo> getUserInfo() {
        List<TbUserInfo> userInfoList = searchFileMapper.getUserInfo();
        return userInfoList;
    }

    @Override
    public List<TbUserInfo> getUserInfoByName(String insName) {
        List<TbUserInfo> userInfoList = searchFileMapper.getInfoByName(insName);
        return userInfoList;
    }

    @Override
    public List<TbUserInfo> getUserInfoByTel(String userTel) {
        List<TbUserInfo> userInfoList = searchFileMapper.getInfoByTel(userTel);
        return userInfoList;
    }



}
