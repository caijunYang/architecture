package com.yang.architecture.common.exception;

import com.yang.architecture.common.ResponsData;
import com.yang.architecture.common.utils.JsonHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by caijunyang  on 2016/8/28.
 */
@Component
public class CoustomExceptionResolver  implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ex.printStackTrace();
        ResponsData responsData=new ResponsData(ResponsData.ERROR);
        if(ex instanceof SystemException){
            responsData.setMsg(ex.getMessage());
        }else {
            responsData.setMsg("系统异常");
        }
        if("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))){
           try {
               response.setContentType("application/json;charset=UTF-8");
               PrintWriter writer = response.getWriter();
               String jsonStr = JsonHelper.obj2Json(responsData);
               writer.write(jsonStr);
               writer.flush();
               writer.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
        }else{
            ModelAndView mv=new ModelAndView();
            mv.setViewName("erro");
            mv.addObject("responsData",responsData);
            return mv;
        }
         return null;
    }
}
