package com.yang.architecture.common.controller;

import com.yang.architecture.common.ResponsData;

/**
 * Created by caiun.yang on 2016/8/21.
 */
public abstract class BaseController {

    protected ResponsData getResponsData(){
        return new ResponsData();
    }

    protected ResponsData getResponsDataForExp(String msg){
        return new  ResponsData(ResponsData.ERROR,msg);
    }
    protected ResponsData getResponsData(Object data){
        return new ResponsData().putData(data);
    }

}
