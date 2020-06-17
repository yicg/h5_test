package com.yilutong.utils;


import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class DateFormatUtils {

    public static final String ZH_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";
    public static final String ZN_DATE_FORMAT="yyyy年MM月dd日 HH:mm:ss";
    public static final String ZC_DATE_FORMAT="yyyy年MM月dd日";
    public static final String SHORT_DATE_FORMAT = "yy-MM-dd HH:mm";
    public static final String CHECK_LOG_FORMAT = "yyyyMMdd";
    public static final String REPORT_CSV_FORMAT = "yyyy年MM月dd日-HH时mm分ss秒SSS毫秒";
    private static SimpleDateFormat simpleDateFormat;

    /**
     * 当前时间标准格式
     * @param type
     * @return
     */
    public static String format(String type){
        simpleDateFormat=new SimpleDateFormat(type);
        String s=simpleDateFormat.format(new Date());
        return s;
    }


    /**
     * 获取时间戳到秒
     * @return
     */
    public static String time(){
       long currtime= System.currentTimeMillis()/1000;
        String randomNum=String.valueOf(currtime);
        return randomNum;
    }
}
