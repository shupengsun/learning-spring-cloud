package com.rain.goods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rain.goods.bean.ResultBean;
import com.rain.goods.entity.Goods;

@RestController
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/get/{id}")
	public ResultBean<Goods> getGoods(@PathVariable String id) {
		ResultBean<Goods> resultBean = new ResultBean<Goods>();
		try {
			String url = "http://microservice-provider-user/login/zhangsan/123456";
			ResultBean<?> forObject = restTemplate.getForObject(url, ResultBean.class);

			resultBean.setStatus("0");
			if ("0".equals(forObject.getStatus())) {
				Goods goods = new Goods();
				goods.setId(Long.valueOf(id));
				goods.setGoodsName("图书-《异类》");
				goods.setGoodsCount(100);

				resultBean.setData(goods);
			} else {
				resultBean.setStatus("1");
				resultBean.setErrorMessage(forObject.getErrorMessage());
			}

		} catch (Exception e) {
			resultBean.setStatus("9");
			resultBean.setErrorMessage("系统异常!");
		}

		return resultBean;
	}

}
