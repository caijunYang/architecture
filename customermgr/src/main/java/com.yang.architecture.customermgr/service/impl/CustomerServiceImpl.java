package com.yang.architecture.customermgr.service.impl;

import com.yang.architecture.customermgr.dao.CustomerDao;
import com.yang.architecture.customermgr.entity.Customer;
import com.yang.architecture.customermgr.entity.query.CustomerQueryModel;
import com.yang.architecture.customermgr.service.ICustomerService;
import com.yang.architecture.common.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/21.
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer,CustomerQueryModel> implements ICustomerService {
    private CustomerDao customerDao=null;
    @Autowired
    public void setDAO(CustomerDao dao) {
        this.customerDao=dao;
        super.setDAO(dao);

    }

    public Customer findByShowName(String showName) throws Exception {
      return   customerDao.findByShowName(showName);
    }
}
