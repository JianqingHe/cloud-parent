package org.spring.cloud.region;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * application
 *  
 * @author hejq
 * @date 2019-01-23 16:08
 */
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class CloudRegionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRegionApplication.class, args);
	}

}

