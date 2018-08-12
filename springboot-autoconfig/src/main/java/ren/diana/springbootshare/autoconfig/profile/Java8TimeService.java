package ren.diana.springbootshare.autoconfig.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.time.Instant;

/**
 * @author gongqiao
 * @since 2018-08-12
 */


@Profile("jdk_1.8")
@Service
public class Java8TimeService implements TimeService{

    @Override
    public long getNowTimeSec() {
        System.out.println("使用 jdk1.8 Instant 获取当前时间");
        return Instant.now().getEpochSecond();
    }
}
