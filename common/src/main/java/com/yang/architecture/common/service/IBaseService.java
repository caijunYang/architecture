package com.yang.architecture.common.service;

import com.yang.architecture.common.pageutils.Page;

/**
 * Created by Administrator on 2016/8/21.
 */
public interface IBaseService<M,QM> {
    public void create(M m)throws Exception;
    public void update(M m)throws Exception;
    public void delete(Long uuid)throws Exception;

    public M getByUuid(Long uuid)throws Exception;
    public Page<M> queryPage(QM qm)throws Exception;
}
