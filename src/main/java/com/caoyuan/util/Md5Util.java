package com.caoyuan.util;

//import org.springframework.util.DigestUtils;

/*********************************************************
 @ClassName: Md5Util
 @Description: 加密
 @author: 曹原
 @date: 2019年11月19日 上午9:46:27
 *********************************************************/
public class Md5Util {
    /**
     * 直接对密码进行散列，那么黑客可以对通过获得这个密码散列值，
     * 然后通过查散列值字典（例如MD5密码破解网站），得到某用户的密码。
     * 加Salt可以一定程度上解决这个问题
     */
    //加盐值 :
    private static String salt = "1a2b3c4d";

    //第一种springframework自带的util,推荐使用,不加盐也行
    //import org.springframework.util.DigestUtils;
    //public static String md5Encoding(String password) {
    //    //密码加盐
    //    return DigestUtils.md5DigestAsHex((password + salt).getBytes());
    //}

    //这是第二种加密方式,得导入apache的包
    //import org.apache.commons.codec.digest.DigestUtils;
    //public static String md5Encoding(String password) {
    //	//return  DigestUtils.md5Hex(password+salt);
    //}
}
