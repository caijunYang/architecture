package com.yang.architecture.customermgr.dao;

import com.yang.architecture.customermgr.entity.Customer;
import com.yang.architecture.customermgr.entity.query.CustomerQueryModel;
import com.yang.architecture.dao.BaseDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/8/21.
 */
@Repository
public interface CustomerDao extends BaseDAO<Customer,CustomerQueryModel> {
}
