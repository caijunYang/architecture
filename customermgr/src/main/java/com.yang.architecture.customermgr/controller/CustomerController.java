package com.yang.architecture.customermgr.controller;

import com.yang.architecture.common.ResponsData;
import com.yang.architecture.common.controller.BaseController;
import com.yang.architecture.common.exception.SystemException;
import com.yang.architecture.common.pageutils.Page;
import com.yang.architecture.customermgr.entity.Customer;
import com.yang.architecture.customermgr.entity.query.CustomerQueryModel;
import com.yang.architecture.customermgr.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by caijun.yang on 2016/8/21.
 */
@Controller
@RequestMapping("customer")
public class CustomerController extends BaseController {
    @Autowired
    private ICustomerService customerService;
    @RequestMapping(value = "save",method = RequestMethod.POST)
    @ResponseBody
    public ResponsData create(@RequestBody Customer customer)throws Exception{
        customerService.create(customer);
        return getResponsData();
    }
    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponsData delete(@PathVariable("id") Long id)throws Exception{
        customerService.delete(id);
        return getResponsData();
    }
    @RequestMapping(value = "toUpdate/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponsData toUpdate(@PathVariable("id") Long id)throws Exception{
        Customer customer = customerService.getByUuid(id);
        return getResponsData().putData(customer);
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public ResponsData update(@RequestBody Customer customer)throws Exception{
        customerService.update(customer);
        return getResponsData();
    }

    @RequestMapping(value = "list")
    @ResponseBody
    public ResponsData list(@RequestBody CustomerQueryModel queryModel)throws Exception{
        if(queryModel==null){
            queryModel=new CustomerQueryModel();
        }
        Page<Customer> pageResult = customerService.queryPage(queryModel);
        return getResponsData().putData(pageResult);
    }
    @RequestMapping(value="toList",method = RequestMethod.GET)
    public String toList()throws Exception{
        return "customer_list";
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ResponsData Login(@RequestBody Customer customer)throws Exception{
        Customer cus = customerService.findByShowName(customer.getShowName());
        if(null==cus){
            throw new SystemException("账号不存在");
        }
        if(!customer.getPwd().equals(cus.getPwd())){
            throw new SystemException("密码错误!");
        }
        return getResponsData();
    }
    @RequestMapping(value = "loginOut",method = RequestMethod.GET)
    public  String loginOut(HttpServletRequest request)throws Exception{
        request.getSession().invalidate();
        return "redirect:/login.jsp";
    }
}
