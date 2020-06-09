package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.AccountDao;
import com.itheima.ssm.domain.Account;
import com.itheima.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/7/25 14:57
 * @Version V1.0
 */
@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public List<Account> findAllAccount() {
        System.out.println("【AccountServiceImpl】中的findAllAccount方法");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("【AccountServiceImpl】中的saveAccount方法");
        accountDao.save(account);
        // int i = 10/0;
    }
}
