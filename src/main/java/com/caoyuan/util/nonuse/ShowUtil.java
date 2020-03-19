package com.caoyuan.util.nonuse;

/*********************************************************
@作者:曹原
@日期:2019年11月8日
@时间:下午4:14:15
*********************************************************/
public class ShowUtil {
	public static void showAllUtil() {
		System.out.println("日期工具类:		DateUtil.java\r\n"
				+ "当月初始1   		getDateByInitMonth(String date, int pattern)	返回date\r\n"
				+ "当月初始2  		getDateByInitMonth(Date date)			返回date\r\n"
				+ "当月最末1   		getDateByFullMonth(String date, int pattern)	返回date\r\n"
				+ "当月最末2   		getDateByFullMonth(Date date)			返回date\r\n"
				+ "时间段随机1 		randomDate(String d1, String d2, int pattern)	返回date\r\n"
				+ "时间段随机2 		randomDate(Date d1, Date d2)			返回date\r\n" 
				+ "时间转字符串		format(Date date, int pattern)			返回String\r\n" 
				+ "字符串转时间		parse(String str, int pattern)			返回Date\r\n" 
				+ "获得年龄1			getAge(String birthDay, int pattern)		返回int\r\n"  
				+ "获得年龄2			getAge(Date birthDay)				返回int\r\n"  
				+ "是否为当天1		isToday(String date)				返回boolean\r\n"  
				+ "是否为当天2		isToday(Date date)				返回boolean\r\n"  
				+ "是否是本周1		isThisWeek(String date, int pattern)		返回boolean\r\n"  
				+ "是否是本周2		isThisWeek(Date date)				返回boolean\r\n"  
				+ "剩余天数			remainingDays(Date d1,Date d2)			返回int"
				+ "\r\n\r\n" + "文件工具类:		FileUtil.java\r\n"
				+ "文件后缀			getExtendName(String fileName)		返回String\r\n"
				+ "系统临时目录		getTempDirectory()			返回File\r\n"
				+ "用户目录			getUserDirectory()			返回File\r\n" + "\r\n"
				+ "随机数工具类:		RandomUtil.java\r\n"
				+ "随机数1			random(int min, int max)		返回int\r\n"
				+ "随机数2			random(long min, long max)		返回long\r\n"
				+ "随机数数组			subRandom(int min, int max, int len) 	返回int[]\r\n"
				+ "随机英文和数字		randomCharacter()			返回char\r\n"
				+ "随机几个英文和数字		randomString(int length)		返回String\r\n"
				+ "随机长度数字		randomNumber(int length)		返回String\r\n" + "\r\n"
				+ "流工具类:			StreamUtil.java\r\n"
				+ "关流			closeAll(AutoCloseable... cc)		返回void\r\n"
				+ "读文件内容1		readTextFile(InputStream inputStream)	返回String\r\n"
				+ "读文件内容2		readTextFile(File file)			返回String\r\n"
				+ "读文件内容3		readTextFile(String txtFile)		返回String\r\n"
				+ "读取行返回list		readLineTextFile(File txtFile)		返回String\r\n"  
				+ "向文件中写内容		Write2File(String filename, String str) 返回String\r\n\r\n"
				+ "字符串工具类:		StringUtil.java\r\n"
				+ "是否null和空串		hasLength(String string)		返回boolean\r\n"
				+ "是否null和空白		hasText(String string)			返回boolean\r\n"
				+ "随机中文			randomChineseString()			返回String\r\n"
				+ "随机几个中文		randomChineseString(int length)		返回String	\r\n"
				+ "随机中文名			generateChineseName()			返回String	\r\n"
				+ "是否是数字			isNumber(String num)			返回boolean	\r\n" + "\r\n"
				+ "分页工具类:		PageUtil.java\r\n" 
				+ "button按钮		getPageButton(Model model, PageInfo page)	返回void\r\n" 
				+ "submit按钮		getPageSubmit(Model model, PageInfo page)	返回void");
	}
	public static void main(String[] args) {
		showAllUtil();
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
