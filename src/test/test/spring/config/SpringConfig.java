package spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      //作为配置类,加载配置文件
@ComponentScan(basePackages = "spring")
public class SpringConfig {

}
