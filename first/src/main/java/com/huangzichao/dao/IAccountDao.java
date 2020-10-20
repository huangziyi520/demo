package com.huangzichao.dao;

import com.huangzichao.domain.Account;

import java.util.List;

public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 根据id查询账户
     * @param id
     * @return
     */
    Account findAccountById(Integer id);

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除account
     * @param id
     */
    void deleteAccount(Integer id);
    void addNewAc();
}
