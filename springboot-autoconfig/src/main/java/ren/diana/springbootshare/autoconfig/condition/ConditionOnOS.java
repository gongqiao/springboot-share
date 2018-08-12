package ren.diana.springbootshare.autoconfig.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author gongqiao
 * @since 2018-08-12
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OSCondition.class)
public @interface ConditionOnOS {

    /**
     * 操作系统
     * @return
     */
    String os();
}
