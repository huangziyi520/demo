package com.huangzichao.ui;

import com.huangzichao.service.impl.AccountServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        AccountServiceImpl iAccountServiceImpl= (AccountServiceImpl)context.getBean("accountServiceImpl");
        System.out.println(iAccountServiceImpl);
        iAccountServiceImpl.toString();
    }
}
