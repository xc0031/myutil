package com.caoyuan.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/*********************************************************
@作者:曹原
@日期:2019年11月7日
@时间:下午8:28:08
流处理工具类
*********************************************************/
public class StreamUtil {
	/**
	 * 批量关闭流，参数能传无限个。
	 * 可变参数 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	 */
	public static void closeAll(AutoCloseable... autoCloseable) {
		//可变长度参数知识点:当参数为1个的时候,默认不是数组.2个以上才是数组,所以要判断非null
		if (null != autoCloseable && autoCloseable.length > 0) {
			for (AutoCloseable cc : autoCloseable) {
				if (null != cc) {
					try {
						cc.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	/**
	 * 传入一个文本文件对象，默认为UTF-8编码，返回该文件内容，要求方法内部调用上面第1个方法关闭流
	 */
	public static String readTextFile(InputStream inputStream) {
		// 设置缓存区
		byte[] bs = new byte[1024];
		// 读取出的长度
		int x = 0;
		String str = "";
		try {
			while (-1 != (x = inputStream.read(bs))) {
				str += new String(bs, 0, x, "utf-8");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeAll(inputStream);
		}
		return str;
	}

	/**
	 * 传入文本文件对象，返回该文件内容，并且要求内部调用上面第2个方法。* 这是典型的方法重载，记住了吗？少年…
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException {
		return readTextFile(new FileInputStream(txtFile));
	}

	/**
	 * 传入文本文件路径，返回该文件内容
	 */
	public static String readTextFile(String txtFile) throws FileNotFoundException {
		return readTextFile(new FileInputStream(txtFile));
	}

	/**
	 * 一行行读取文件并写入list集合
	 */
	public static List<String> readLineTextFile(File txtFile) {
		List<String> list = new ArrayList<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream(txtFile), "utf-8"));
			String str = "";
			while (null != (str = br.readLine())) {
				list.add(str);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeAll(br);
		}
		return list;
	}

	/**
	 * 向文件中写内容
	 */
	public static void Write2File(String filename, String str) {
		File file = new File(filename);
		BufferedWriter bw = null;
		try {
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			if (!file.exists()) {
				file.createNewFile();
			}
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			bw.write(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeAll(bw);
		}
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
