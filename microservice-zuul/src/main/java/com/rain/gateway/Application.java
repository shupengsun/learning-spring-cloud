package com.rain.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <h1>微服务网关使用说明</h1>
 * 
 * <p>
 * <strong>依次启动：</strong>
 * <li>microservice-discovery-eureka</li>
 * <li>microservice-user</li>
 * <li>microservice-goods</li>
 * <li>microservice-zuul</li>
 * <p>
 * 
 * <strong>测试地址：</strong>
 * <li>http://127.0.0.1:9100/microservice-user/login/zhangsan/123456
 * </li>
 * <li>http://127.0.0.1:9100/microservice-goods/goods/get/1</li>
 * <p>
 * 
 * @author rain
 *
 */
@EnableZuulProxy
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
