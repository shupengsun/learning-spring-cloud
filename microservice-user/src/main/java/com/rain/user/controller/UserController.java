package com.rain.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rain.user.bean.ResultBean;

@RestController
public class UserController {
	@GetMapping("/login/{userName}/{password}")
	public ResultBean login(@PathVariable String userName, @PathVariable String password) {
		ResultBean resultBean = new ResultBean();
		try {
			if (!"zhangsan".equals(userName)) {
				resultBean.setStatus("1");
				resultBean.setErrorMessage("用户名错误!");
				return resultBean;
			}

			if (!"123456".equals(password)) {
				resultBean.setStatus("1");
				resultBean.setErrorMessage("用户密码错误!");
				return resultBean;
			}

			resultBean.setStatus("0");
		} catch (Exception e) {
			resultBean.setStatus("9");
			resultBean.setErrorMessage("系统异常!");
		}

		return resultBean;
	}

}
