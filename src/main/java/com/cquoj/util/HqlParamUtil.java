package com.cquoj.util;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by xuwei on 5/29/16.
 */
public class HqlParamUtil {
    /***
     * 通过获取class中字段的类型，将map中的object转换为对应的字段类型，object是网页传过来的，默认是String类型
     * 2中方式获取目标类型：
     * 1.通过直接Filed域的访问获取public字段的类型 、
     * 2.通过访问字段的getter方法的返回值获取字段类型
     * @param mp    网页传过来的参数集合
     * @param clz   需要查找字段类型的类
     * @return      转换之后的参数map对象
     */
    public static Map<String,Object> reType(Map<String,Object> mp,Class clz){
        if(mp==null) return new HashMap<String, Object>();
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

    /***
     * 默认private的getter方法的命名规则，字段str第一个字母大写，例如字段name的getter方法为getName()
     * @param str   字段名称
     * @return  字段的默认getter方法
     */
    private static  String getMethodGet(String str){
        StringBuilder sb=new StringBuilder("get");
        sb.append(str.substring(0, 1).toUpperCase());
        sb.append(str.substring(1));
        return sb.toString();
    }

    /***
     * 将Object转换为Type类型
     * @param type  需要转换的类型
     * @param value 需要转换的对象
     * @return  转换称目标类型的对象
     */
    private  static Object getValueWithType(Type type,Object value){
        if(type==null) return value;
        if(type.getTypeName().equals(int.class.getTypeName()) || type.getTypeName().equals(Integer.class.getTypeName())){
            value  = Integer.parseInt((String) value);
        }else
        if(type.getTypeName().equals(float.class.getTypeName()) || type.getTypeName().equals(Float.class.getTypeName())){
            value  = Float.parseFloat((String) value);
        }else
        if(type.getTypeName().equals(double.class.getTypeName()) || type.getTypeName().equals(Double.class.getTypeName())){
            value  = Double.parseDouble((String) value);
        }else
        if(type.getTypeName().equals(boolean.class.getTypeName()) || type.getTypeName().equals(Boolean.class.getTypeName())){
            value  = Boolean.parseBoolean((String) value);
        }else
        if(type.getTypeName().equals(short.class.getTypeName()) || type.getTypeName().equals(Short.class.getTypeName())){
            value  = Short.parseShort((String) value);
        }else
        if(type.getTypeName().equals(long.class.getTypeName()) || type.getTypeName().equals(Long.class.getTypeName())){
            value  = Long.parseLong((String) value);
        }else
        if(type.getTypeName().equals(Date.class.getTypeName())){
            value  = new Date((String) value);
        }else
        if(type.getTypeName().equals(int.class.getTypeName()) || type.getTypeName().equals(Integer.class.getTypeName())){
            value  = Integer.parseInt((String) value);
        }else
            return value;
        return  value;
    }
}
