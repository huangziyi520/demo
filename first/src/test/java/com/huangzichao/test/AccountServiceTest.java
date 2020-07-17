package com.huangzichao.test;

import com.huangzichao.domain.Account;
import com.huangzichao.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

/**
 * 使用junit单元测试我们的配置
 */
public class AccountServiceTest {

    @Test
    public void findAll() {
        //1.获取容器
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //2. 获取业务层对象
        IAccountService iAccountService=context.getBean("accountService",IAccountService.class);
        //3. 执行方法
        List<Account> lists=iAccountService.findAllAccount();
        for(Account list:lists){
            System.out.println(list);
        }
    }
    @Test
    public void findOne() {
        //1.获取容器
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //2. 获取业务层对象
        IAccountService iAccountService=context.getBean("accountService",IAccountService.class);
        //3. 执行方法
        Account account=iAccountService.findAccountById(2);
        System.out.println(account);
    }
    @Test
    public void save() {
        Account account=new Account();
        account.setId(5);
        account.setName("test05");
        account.setMoney((float)9400);
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        IAccountService iAccountService=context.getBean("accountService",IAccountService.class);
        iAccountService.saveAccount(account);
    }
    @Test
    public void update() {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        IAccountService iAccountService=context.getBean("accountService",IAccountService.class);
        Account account=new Account();
        account.setId(5);
        account.setName("testChange");
        account.setMoney((float)930.3);
        iAccountService.updateAccount(account);
    }
    @Test
    public void delete() {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        IAccountService iAccountService=context.getBean("accountService",IAccountService.class);
        iAccountService.deleteAccount(3);
    }
}
