package com.yang.architecture.customermgr.service;

import com.yang.architecture.customermgr.entity.Customer;
import com.yang.architecture.customermgr.entity.query.CustomerQueryModel;
import com.yang.architecture.common.service.IBaseService;

/**
 * Created by Administrator on 2016/8/21.
 */
public interface ICustomerService extends IBaseService<Customer,CustomerQueryModel> {
    public Customer findByShowName(String showName)throws Exception;
}
