package com.itheima.ssm.service;

import com.itheima.ssm.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAllAccount();
    public void saveAccount(Account account);
    int[] a = new int[5];
    int[] a2 = {};

}