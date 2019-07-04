package com.clesun.bigdataservice.utils;

import java.util.Random;

public class GenerateBatch {


    /**
     *
     * @Title: genBatch
     * @Description: 13位毫秒级时间戳 加五位随机数
     * @param @return    设定文件
     * @return String    返回类型
     * @throws
     */
    @SuppressWarnings("AlibabaAvoidNewDateGetTime")
    public static String getBatch(){
        Random random=new Random();

        String str = "00000"+random.nextInt(99999);

        return System.nanoTime() + str.substring(str.length() - 5);
    }


    public static void main(String[] args) {
        //Random random=new Random();
        //System.out.println(new Date().getTime()+" " +random.nextInt(99999));

        Random random=new Random();
        String str = "00000"+random.nextInt(99999);
        System.out.println(str);
        System.out.println(str.substring(str.length() - 5));

        System.out.println(GenerateBatch.getBatch());

    }



}
