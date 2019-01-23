package org.spring.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * cloud ribbon 启动类
 * 
 * @author hejq
 * @date 2019-01-23 13:50
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
public class CloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRibbonApplication.class, args);
	}

}

