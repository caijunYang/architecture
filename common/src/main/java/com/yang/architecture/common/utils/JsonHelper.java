package com.yang.architecture.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;

/**
 * Created by caijun.yang on 2016/8/21.
 * json解析工具类
 */
public class JsonHelper {
    private JsonHelper(){}

    /**
     * 字符串解析为对象
     * @param jsonStr
     * @param tClass
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T json2Obj(String jsonStr,Class<T> tClass) throws Exception{
        ObjectMapper mapper=new ObjectMapper();
        T t = mapper.readValue(jsonStr, tClass);
        return t;
    }

    /**
     * 对象转json字符串
     * @param obj
     * @return
     * @throws JsonProcessingException
     */
    public static String  obj2Json(Object obj) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        String str = mapper.writeValueAsString(obj);
        return str;
    }

}
