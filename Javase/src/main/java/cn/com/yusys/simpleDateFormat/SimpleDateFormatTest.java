package cn.com.yusys.simpleDateFormat;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @author tianfusheng
 * @e-mail linuxmorebetter@gmail.com
 * @date 2019/10/10
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
        Timestamp d =  new Timestamp(sdf2.parse("20191010101010").getTime());
        System.out.println(d.toString());
    }
}
