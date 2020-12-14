package com.honsung.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Feng Jianhui
 * @since 2020-12-14
 * @version 1.0
 * @Description 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionAdvice {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionAdvice.class);

	/**
	 * 处理自定义的业务异常
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = BusinessException.class)  
	@ResponseBody
	public  ResultBody businessExceptionHandler(HttpServletRequest req, BusinessException e){
		logger.error("发生业务异常！原因是：{}",e.getErrorMsg());
		return ResultBody.error(e.getErrorCode(),e.getErrorMsg());
	}

	/**
	 * 处理空指针的异常
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = NullPointerException.class)
	@ResponseBody
	public ResultBody exceptionHandler(HttpServletRequest req, NullPointerException e){
		logger.error("发生空指针异常！原因是:",e);
		return ResultBody.error(CommonErrorInfoEnum.BODY_NOT_MATCH);
	}

	/**
	 * 处理其他异常
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResultBody exceptionHandler(HttpServletRequest req, Exception e){
		logger.error("未知异常！原因是:",e);
		return ResultBody.error(CommonErrorInfoEnum.INTERNAL_SERVER_ERROR);
	}
}