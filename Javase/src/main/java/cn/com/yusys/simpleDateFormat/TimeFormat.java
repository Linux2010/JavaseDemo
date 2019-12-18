package cn.com.yusys.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author tianfusheng
 * @e-mail linuxmorebetter@gmail.com
 * @date 2019/12/14
 */
public class TimeFormat {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");


        System.out.println(sdf.format(new Date(System.currentTimeMillis())));

    }
}
