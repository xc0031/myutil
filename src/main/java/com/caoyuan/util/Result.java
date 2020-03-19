package com.caoyuan.util;

/*********************************************************
@ClassName:   Result
@Description: Ajax统一返回结果类
@author:	     曹原
@date: 		  2019年11月20日 下午6:21:40 
*********************************************************/
public class Result {

	private Integer code;// 状态码
	private String msg;// 结果信息
	private Object data;// 返回数据,例如list map

	/** 
	 * @Title:Result
	 * @Description: 
	 * @param code
	 * @param msg
	 * @param data 
	 */
	public Result(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	/** 
	 * @Title:Result
	 * @Description:  
	 */
	public Result() {
		super();
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

}
