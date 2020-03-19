package com.caoyuan.util;

import java.io.File;

/*********************************************************
@作者:曹原
@日期:2019年11月7日
@时间:下午8:27:31
文件工具类
*********************************************************/
public class FileUtil {

	/**
	 * 给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”
	 */
	public static String getExtendName(String fileName) {
		if (!StringUtil.hasText(fileName)) {
			return null;
		}
		return fileName.substring(fileName.lastIndexOf("."));
	}

	/**
	 * 返回操作系统临时目录
	 * @return
	 */
	public static File getTempDirectory() {
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}

	/**
	 * 创建getUserDirectory方法
	 * 方法3：返回操作系统用户目录(5分)
	 * 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}>
	 * @return
	 */
	public static File getUserDirectory() {
		String path = System.getProperty("user.home");
		return new File(path);
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
 * 
 * 
 * 
 **/
