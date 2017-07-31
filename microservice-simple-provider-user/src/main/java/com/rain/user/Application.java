package com.rain.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 监控端点：http://{ip}:{port}/{endpoint}<br>
 * 比如：<br>
 * http://127.0.0.1:8000/health<br>
 * http://127.0.0.1:8000/info<br>
 * 
 * @author Rain
 * @version 1.0
 * @date 2017年7月31日 下午9:03:37
 * @since 1.0
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
