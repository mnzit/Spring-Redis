package com.mnzit.spring.redis.redisdemo.util;

import java.util.Arrays;

/**
 * @author Manjit Shakya
 * @email manjit.shakya@f1soft.com
 */
public class CacheKeyGenerator {

    /**
     * Append the method name , param to an array and create a deepHashCode of the array as redis cache key
     *
     * @param methodName
     * @param params
     * @return
     */
    public static String generateKey(String methodName, Object... params) {
        if (params.length == 0) {
            return new Integer(methodName.hashCode()).toString();
        }
        Object[] paramList = new Object[params.length + 1];
        paramList[0] = methodName;
        System.arraycopy(params, 0, paramList, 1, params.length);
        int hashCode = Arrays.deepHashCode(paramList);
        return new Integer(hashCode).toString();
    }

}
