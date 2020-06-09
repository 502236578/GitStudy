package com.itheima.ssm.test;

import com.itheima.ssm.domain.Account;
import com.itheima.ssm.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName TestSpring
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/7/25 15:05
 * @Version V1.0
 */
public class TestSpring {

    // spring整合mybatis
    @Test
    public void testSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        List<Account> allAccount = accountService.findAllAccount(); // 输出，null指针
        System.out.println(allAccount);
    }
}
