package com.mnzit.spring.redis.redisdemo.parser.expression;

import org.springframework.util.Assert;

import java.lang.reflect.Method;

/**
 * @author Manjit Shakya
 * @email manjit.shakya@f1soft.com
 */
public class CacheExpressionRootObject {

    private final Method method;

    private final Object[] args;

    private final Object target;

    private final Class<?> targetClass;

    private final String key;

    public CacheExpressionRootObject(Method method, Object[] args, Object target, Class<?> targetClass) {

        Assert.notNull(method, "Method is required");
        Assert.notNull(targetClass, "targetClass is required");
        this.method = method;
        this.target = target;
        this.targetClass = targetClass;
        this.args = args;
        this.key = "";
    }

    public Method getMethod() {
        return this.method;
    }

    public String getMethodName() {
        return this.method.getName();
    }

    public Object[] getArgs() {
        return this.args;
    }

    public Object getArg(int position){
        return this.args[position];
    }

    public Object getTarget() {
        return this.target;
    }

    public Class<?> getTargetClass() {
        return this.targetClass;
    }

}
