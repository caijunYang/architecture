package com.yang.architecture.service.impl;

import com.yang.architecture.pageutils.Page;
import com.yang.architecture.QueryModel.BaseQueryModel;
import com.yang.architecture.dao.BaseDAO;
import com.yang.architecture.service.IBaseService;

import java.util.List;

/**
 * Created by caijun.yang on 2016/8/21.
 */
public  abstract class BaseServiceImpl<M, QM extends BaseQueryModel> implements IBaseService<M,QM> {
    private BaseDAO dao = null;
    public void setDAO(BaseDAO dao){
        this.dao = dao;
    }
    public void create(M m) {
        dao.create(m);
    }

    public void update(M m) {
        dao.update(m);
    }

    public void delete(int uuid) {
        dao.delete(uuid);
    }

    public M getByUuid(int uuid) {
        return (M)dao.getByUuid(uuid);
    }

    public Page<M> getByConditionPage(QM qm) {
        List<M> list = dao.getByConditionPage(qm);
        qm.getPage().setResult(list);

        return qm.getPage();
    }
}

