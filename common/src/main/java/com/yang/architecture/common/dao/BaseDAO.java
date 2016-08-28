package com.yang.architecture.common.dao;

import java.util.List;


public interface BaseDAO<M,QM>{
	
	public void create(M m)throws Exception;
	public void update(M m)throws Exception;
	public void delete(Long uuid)throws Exception;
	
	public M getByUuid(Long uuid)throws Exception;
	public List<M> getByConditionPage(QM qm)throws Exception;
}
