package ren.diana.springbootshare.autoconfig.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author gongqiao
 * @since 2018-08-12
 */

@Profile("jdk_1.7")
@Service
public class Java7TimeService implements TimeService{

    @Override
    public long getNowTimeSec() {
        System.out.println("使用 jdk1.7 System.currentTimeMillis 获取当前时间");
        return System.currentTimeMillis()/1000;
    }
}
