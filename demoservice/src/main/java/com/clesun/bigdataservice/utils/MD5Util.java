package com.clesun.bigdataservice.utils;


import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by Administrator on 2017/4/25.
 */
public class MD5Util {

    public static String md5BySalt(String plainText, String salt){
        if(null == plainText || "" == plainText){
            plainText = "000000";
        }
        if(null == salt || "" == salt){
            salt = "7879$^$%$%^%$jjksf;%^$%$&^^%yihhkfdnhkhs%%%^^&%&";
        }
        return new Md5Hash(plainText,salt,2).toHex();
    }



    public static void main(String[] args) {
        System.out.println(md5BySalt("123456abc",""));
    }

}