package org.spring.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * cloud client 启动类
 *
 * @author hejq
 * @date 2019-01-23 11:41
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudClientApplication.class, args);
	}

}

