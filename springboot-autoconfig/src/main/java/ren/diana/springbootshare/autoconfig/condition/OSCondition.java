package ren.diana.springbootshare.autoconfig.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author gongqiao
 * @since 2018-08-12
 */
public class OSCondition implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String,Object> map = metadata.getAnnotationAttributes(ConditionOnOS.class.getName());
        return System.getProperty("os").equals(map.get("os"));

    }
}
