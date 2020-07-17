package com.huangzichao.dao.impl;

import com.huangzichao.dao.IAccountDao;
import com.huangzichao.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDao implements IAccountDao {

    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public List<Account> findAllAccount() {
        try {
            return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Account findAccountById(Integer id) {
        try {
            return runner.query("select * from account where id=?",new BeanHandler<Account>(Account.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveAccount(Account account) {
        try {
            runner.update("insert into account (name,money) values (?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAccount(Account account) {
        try {
            runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAccount(Integer id) {
        try {
            runner.update("delete from account where id=?",id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
