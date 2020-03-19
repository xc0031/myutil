package com.caoyuan.util;

import java.util.HashSet;

/*********************************************************
@作者:曹原
@日期:2019年11月7日
@时间:下午8:31:05
随机数工具类
*********************************************************/
public class RandomUtil {
	/**
	 * 返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 
	 */
	public static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	/**
	 * 返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 
	 */
	public static long random(long min, long max) {
		return (long) (Math.random() * (max - min + 1) + min);
	}

	/**
	 * 在最小值min与最大值max之间截取len个不重复的随机数
	 * 例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。
	 * 应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。
	 */
	public static int[] subRandom(int min, int max, int len) {
		HashSet<Integer> set = new HashSet<>();
		// 如果set集合没放足够的数量,就一直循环
		int[] arr = new int[len];
		int i = 0;
		while (set.size() != len) {
			int random = random(min, max);
			boolean add = set.add(random);
			if (add) {
				arr[i] = random;
				i++;
			}
		}
		return arr;
	}

	/**
	 * 返回1个0-9,a-Z之间的随机字符
	 */
	public static char randomCharacter() {
		String s = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return s.charAt(random(0, s.length() - 1));
	}
	/**
	 * 返回1个a-Z之间的随机字符
	 */
	public static char randomCharacter2() {
		String s = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return s.charAt(random(0, s.length() - 1));
	}

	/**
	 * 返回参数length个字符串
	 * 方法内部要调用randomCharacter()
	 */
	public static String randomString(int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(randomCharacter());
		}
		return sb.toString();
	}
	/**
	 * 返回参数length个字符串,只有字母,无数字
	 * 方法内部要调用randomCharacter2()
	 */
	public static String randomString2(int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(randomCharacter2());
		}
		return sb.toString();
	}

	/**
	 * 返回任意长度的数字。
	 */
	public static String randomNumber(int length) {
		String str = "1234567890";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(str.charAt(random(0, str.length() - 1)));
		}
		return sb.toString();
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
