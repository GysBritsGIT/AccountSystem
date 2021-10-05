package za.ac.nwu.milesreward.web.sb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.milesreward.web.sb.controller",
        "za.ac.nwu.milesreward.web.sb.exception"
})

public class WebConfig {
}
