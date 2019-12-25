package com.xiaoyu.spi;

import java.lang.annotation.*;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2019/12/24 11:42 AM
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Animal {
    String value() default "";
}
