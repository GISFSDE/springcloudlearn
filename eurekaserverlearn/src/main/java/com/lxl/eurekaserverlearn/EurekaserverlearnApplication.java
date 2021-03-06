package com.lxl.eurekaserverlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/**启动一个服务注册中心**/
@EnableEurekaServer

/**
 * @author lxl
 **/
public class EurekaserverlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverlearnApplication.class, args);
    }

}
