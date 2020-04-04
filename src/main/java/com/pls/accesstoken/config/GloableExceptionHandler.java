package com.pls.accesstoken.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理
 * @author 81046
 *
 */
@ControllerAdvice
public class GloableExceptionHandler {

	private final static Logger LOGGER = LoggerFactory.getLogger(GloableExceptionHandler.class);

	/**
	 * 返回到前端 字符串         注意这些方法不能同时用，只能用一个哦
	 */
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public String defaultErrorHandler2() {
		System.out.println("******defaultErrorHandler2****");
		return "系统错误，请联系管理员！";
	}
	
}
