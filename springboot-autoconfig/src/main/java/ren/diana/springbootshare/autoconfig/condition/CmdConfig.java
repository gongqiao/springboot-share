package ren.diana.springbootshare.autoconfig.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gongqiao
 * @since 2018-08-12
 */

@Configuration
public class CmdConfig {

    @Bean
    @ConditionOnOS(os="linux")
    public CmdTool LinuxCmd(){
        return new CmdTool("shell");
    }


    @Bean
    @ConditionOnOS(os="windows")
    public CmdTool windowsCmd(){
        return new CmdTool("dos");
    }
}
