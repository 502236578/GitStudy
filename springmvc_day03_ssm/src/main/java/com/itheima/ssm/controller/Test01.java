package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Account;
import com.itheima.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class Test01 {
    @Autowired
    AccountService accountService;

    // 查询所有
    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        System.out.println("【AccountController】类中的findAll方法");
        long t1 = System.currentTimeMillis();
        List<Account> list = accountService.findAllAccount();
        long t2 = System.currentTimeMillis();
        System.out.println("第一次查询用时"+(t2-t1));
        long t3 = System.currentTimeMillis();
        List<Account> list2 = accountService.findAllAccount();
        long t4 = System.currentTimeMillis();
        System.out.println("第二次查询用时"+(t4-t3));
        model.addAttribute("list",list);
        return "success";
    }

    // 保存
    @RequestMapping(value = "/save")
    public String save(Account account){
        System.out.println("【AccountController】类中的save方法");
        accountService.saveAccount(account);
        //return "success";
        return "redirect:/account/findAll";

    }
}
