package cn.zhh.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 为该属性注入RPC服务对象
 * @author z_hh
 * @time 2019年1月8日
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface RpcReference {

}
