package com.xsj.util;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author: xieshaojun
 * @Date: 2018-10-28 10:41
 * @Version 1.0
 */
public class InvokeThread extends Thread {

    int i;
    @Override
    public void run() {
        for (;i<30;i++){
            System.out.println(Thread.currentThread().getName()+">>>:"+i+"状态："+this.isAlive());
        }
    }
    public static void main(String[] a){
        InvokeThread invokeThread=new InvokeThread();
        for (int i=0;i<150;i++){
            System.out.println("main:"+Thread.currentThread().getName()+">："+i+"》》15前状态："+invokeThread.isAlive());
            if (i==15){
                invokeThread.start();
                System.out.println("状态："+invokeThread.isAlive());
            }
            if (i>15 && !invokeThread.isAlive()){
                invokeThread.start();
            }

        }
    }
}
