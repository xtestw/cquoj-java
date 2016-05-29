package com.cquoj.util;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by xuwei on 5/29/16.
 */
public class HqlParamUtil {
    public static Map<String,Object> ReType(Map<String,Object> mp,Class clz){
        for(Iterator it =mp.entrySet().iterator();it.hasNext();){
            Map.Entry t= (Map.Entry) it.next();
        }
        return mp;
    }
}
