package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // 加与不加效果是一样的
public interface AccountDao {

    // 查询所有
    @Select(value = "select * from account")
    public List<Account> findAll();

    // 保存
//    @Insert(value = "insert into account(name,money) values (#{name},#{money})")
    public void save(Account account);

    public void delete(int id);

}
