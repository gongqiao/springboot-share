package ren.diana.springbootshare.autoconfig.profile;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * profile 自动配置 引导类
 *
 * @author gongqiao
 * @since 2018-08-12
 */

@SpringBootApplication(scanBasePackages = "ren.diana.springbootshare.autoconfig.profile")
public class ProfileConfigBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new SpringApplicationBuilder(ProfileConfigBootstrap.class)
                        .profiles("jdk_1.7")
                        .run(args);
        TimeService timeService = applicationContext.getBean(TimeService.class);
        System.out.println("timeService.getNowTimeSec() = " + timeService.getNowTimeSec());
        applicationContext.close();
    }
}
