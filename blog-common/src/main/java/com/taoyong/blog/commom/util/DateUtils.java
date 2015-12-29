package com.taoyong.blog.commom.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by taoyong on 15/12/26.
 */
public class DateUtils {

    public static String getCurrentDateTimeStr(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String currentDateTimeStr = df.format(new Date());
        return currentDateTimeStr;
    }
}
