package com.cquoj.util;

import org.junit.Test;

import java.lang.reflect.Type;

/**
 * Created by admin on 2016/5/31.
 */
public class HqlParamUtilTest {

    public class T{
        private int t;

        public int getT() {
            return t;
        }

        public void setT(int t) {
            this.t = t;
        }
    }

    @Test
    public void getPrivateFiledType(){

            try {
                Type t=T.class.getMethod("getT").getReturnType();
                System.out.println(t.toString());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
    }

    @Test
    public void getMethodGet(){

    }
}
