package com.yang.architecture.common.utils;

import org.apache.commons.lang.StringUtils;

import javax.swing.plaf.PanelUI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by caijun.yang on 2016/8/21.
 */
public class DateUtils {
    private DateUtils(){}

    public final static String  SIMPLEDATE="yyyy-MM-dd";
    public final static String  EXACT_DATE="yyyy-MM-dd HH:mm:ss";

    /**
     * 日期转为字符串
     * @param date
     * @param fmtStr
     * @return
     */
    public static String date2Str(Date date,String fmtStr){
        SimpleDateFormat df=new SimpleDateFormat(StringUtils.isNotBlank(fmtStr)?fmtStr:EXACT_DATE);
        String str = df.format(date);
        return str;
    }

    /**
     * 字符串根据格式转为日期
     * @param str
     * @param fmtStr
     * @return
     * @throws ParseException
     */
    public static Date str2Date(String str,String fmtStr) throws ParseException {
        SimpleDateFormat df=new SimpleDateFormat(StringUtils.isNotBlank(fmtStr)?fmtStr:EXACT_DATE);
        Date date = df.parse(str);
        return date;
    }
}
