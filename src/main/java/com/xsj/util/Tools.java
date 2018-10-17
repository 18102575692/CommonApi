package com.xsj.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 工具类型
 * @Author: xieshaojun
 * @Date: 2018-10-17 21:40
 * @Version 1.0
 */
public class Tools {
    private static AtomicInteger atomicInteger=new AtomicInteger();
    /*获取时间戳*/
    public static long getTime(){
        return Calendar.getInstance().getTimeInMillis();
    }
    /*获取18位ID*/
    public static String getRandomUUID() {
         //1、创建时间戳
         java.util.Date dateNow = new java.util.Date();
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
         String dateNowStr = dateFormat.format(dateNow);
         StringBuffer sb = new StringBuffer(dateNowStr);
         //2、创建随机对象
         Random rd = new Random();
         //3、产生4位随机数
         String n = "";
         int rdGet; //取得随机数
         do {
             rdGet = Math.abs(rd.nextInt()) % 10 + 48; //产生48到57的随机数(0-9的键位值)
             // rdGet=Math.abs(rd.nextInt())%26+97; //产生97到122的随机数(a-z的键位值)
             char num1 = (char) rdGet;
             String dd = Character.toString(num1);
             n += dd;
             } while (n.length() < 4);// 假如长度小于4
         sb.append(n);
         //4、返回唯一码
          return sb.toString();
    }
    public static void main(String[] a){
        System.out.println(getRandomUUID());
    }

}
