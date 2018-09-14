package com.dc.controller;

import com.dc.pojo.TbUserInfo;
import com.dc.service.FileManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;


@Controller
@SessionAttributes("list")
public class FileManagerController {
    @Autowired
    private FileManagementService fileManagementService;

    @RequestMapping("/")
    public String getUserInfo(Model model){
        List<TbUserInfo> list = fileManagementService.getUserInfo();
        model.addAttribute("list",list);
        System.out.println(list);
        return  "sucdoc";
    }

    @RequestMapping("/sucdoc/{insName}")
    public String getUserInfoByName(@PathVariable String insName, Model model) {
        List<TbUserInfo> list = fileManagementService.getUserInfoByName(insName);
        model.addAttribute("insName",insName);
        model.addAttribute("list",list);
        System.out.println(list);
        return "sucdoc";
    }
    @RequestMapping("/sucdoc/{userTel}")
    public String  getUserInfoByTel(@PathVariable String userTel,Model model){
        List<TbUserInfo> list = fileManagementService.getUserInfoByTel(userTel);
        model.addAttribute("userTel",userTel);
        model.addAttribute("list",list);
        System.out.println(list);
        return "sucdoc";
    }

}
