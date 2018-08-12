package ren.diana.springbootshare.autoconfig.condition;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author gongqiao
 * @since 2018-08-12
 */

@SpringBootApplication(scanBasePackages = "ren.diana.springbootshare.autoconfig.condition")
public class ConditionBootstrap {

    public static void main(String[] args) {

        System.setProperty("os","linux");

        ConfigurableApplicationContext applicationContext =
                new SpringApplicationBuilder(ConditionBootstrap.class)
                        .run(args);

        CmdTool cmdTool = applicationContext.getBean(CmdTool.class);
        System.out.println("获取当前系统的命令行工具" + cmdTool);
        applicationContext.close();
    }
}
