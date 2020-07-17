package com.huangzichao.service.impl;

import com.huangzichao.dao.IAccountDao;
import com.huangzichao.domain.Account;
import com.huangzichao.service.IAccountService;

import java.util.*;


public class AccountServiceImpl implements IAccountService {



    private IAccountDao iAccountDao;

    public void setAccountDao(IAccountDao accountDao) {
        iAccountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return iAccountDao.findAllAccount();
    }

    public Account findAccountById(Integer id) {
        return iAccountDao.findAccountById(id);
    }

    public void saveAccount(Account account) {
        iAccountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        iAccountDao.updateAccount(account);
    }

    public void deleteAccount(Integer id) {
        iAccountDao.deleteAccount(id);
    }

}
