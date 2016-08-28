package com.yang.architecture.common.service.impl;

import com.yang.architecture.common.pageutils.Page;
import com.yang.architecture.common.QueryModel.BaseQueryModel;
import com.yang.architecture.common.dao.BaseDAO;
import com.yang.architecture.common.service.IBaseService;

import java.util.List;

/**
 * Created by caijun.yang on 2016/8/21.
 */
public  abstract class BaseServiceImpl<M, QM extends BaseQueryModel> implements IBaseService<M,QM> {
    private BaseDAO dao = null;
    public void setDAO(BaseDAO dao){
        this.dao = dao;
    }
    public void create(M m)throws Exception {
        dao.create(m);
    }

    public void update(M m)throws Exception {
        dao.update(m);
    }

    public void delete(Long uuid)throws Exception {
        dao.delete(uuid);
    }

    public M getByUuid(Long uuid)throws Exception {
        return (M)dao.getByUuid(uuid);
    }

    public Page<M> queryPage(QM qm)throws Exception {
        List<M> list = dao.getByConditionPage(qm);
        qm.getPage().setResult(list);

        return qm.getPage();
    }
}

