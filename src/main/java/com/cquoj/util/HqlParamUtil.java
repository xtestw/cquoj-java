package com.cquoj.util;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by xuwei on 5/29/16.
 */
public class HqlParamUtil {
    public static Map<String,Object> reType(Map<String,Object> mp,Class clz){
        for(Iterator it =mp.entrySet().iterator();it.hasNext();){
            Map.Entry t= (Map.Entry) it.next();
            Type type=null;
            try {
                type = clz.getField((String)t.getKey()).getType();
            } catch (NoSuchFieldException e) {
                try {
                    type = clz.getMethod(getMethodGet((String)t.getKey())).getReturnType();
                } catch (NoSuchMethodException e1) {
                    e1.printStackTrace();
                }
            }
            t.setValue(getValueWithType(type,t.getValue()));
        }

        return mp;
    }

    private static  String getMethodGet(String str){
        StringBuilder sb=new StringBuilder("get");
        sb.append(str.substring(0, 1).toUpperCase());
        sb.append(str.substring(1));
        return sb.toString();
    }

    private  static Object getValueWithType(Type type,Object value){
        if(type==null) return value;
        if(type.getClass().equals(int.class) || type.getClass().equals(Integer.class)){
            value  = Integer.parseInt((String) value);
        }else
        if(type.getClass().equals(float.class) || type.getClass().equals(Float.class)){
            value  = Float.parseFloat((String) value);
        }else
        if(type.getClass().equals(double.class) || type.getClass().equals(Double.class)){
            value  = Double.parseDouble((String) value);
        }else
        if(type.getClass().equals(boolean.class) || type.getClass().equals(Boolean.class)){
            value  = Boolean.parseBoolean((String) value);
        }else
        if(type.getClass().equals(short.class) || type.getClass().equals(Short.class)){
            value  = Short.parseShort((String) value);
        }else
        if(type.getClass().equals(long.class) || type.getClass().equals(Long.class)){
            value  = Long.parseLong((String) value);
        }else
        if(type.getClass().equals(Date.class)){
            value  = new Date((String) value);
        }else
        if(type.getClass().equals(int.class) || type.getClass().equals(Integer.class)){
            value  = Integer.parseInt((String) value);
        }else
            return value;
        return  value;
    }
}
