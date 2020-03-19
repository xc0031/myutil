package com.caoyuan.util;

/*********************************************************
@ClassName:   ResultUtil
@Description: 统一返回结果类工具类
@author:	     曹原
@date: 		  2019年11月20日 下午6:24:07 
*********************************************************/
public class ResultUtil {

	/**
	 * @Title: success 
	 * @Description: 默认正确,ajax都是调用这个
	 * @param Object
	 * @param data
	 * @return
	 * @return: Result
	 */
	public static Result success(Object data) {
		Result result = new Result();
		result.setCode(0);
		result.setMsg("成功");
		result.setData(data);
		return result;
	}

	/**
	 * @Title: success 
	 * @Description: 默认正确,用于传送正确值0
	 * @return
	 * @return: Result
	 */
	public static Result success() {
		return success(null);
	}

	/**
	 * @Title: error 
	 * @Description: 用于处理自定义异常
	 * @param code	自定义状态码
	 * @param msg	自定义异常信息
	 * @return
	 * @return: Result
	 */
	public static Result error(Integer code, String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
}
/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
