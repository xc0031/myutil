package com.caoyuan.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*********************************************************
 @作者:曹原
 @日期:2019年11月7日
 @时间:下午7:37:16 日期工具类
 *********************************************************/
public class DateUtil {

    /**
     * 给一个时间对象，返回该时间所在月的1日0时0分0秒。
     * 例如一个Date对象的值是2019-05-18 11:37:22
     * 则返回的结果为2019-05-01 00:00:00
     * pattern = 1 对应"yyyy-MM-dd HH:mm:ss";
     * pattern = else 对应"yyyy-MM-dd";
     */
    public static Date getDateByInitMonth(String date, int pattern) {
        return getDateByInitMonth(parse(date, pattern));
    }

    /**
     * 给一个时间对象，返回该时间所在月的1日0时0分0秒。
     * 例如一个Date对象的值是2019-05-18 11:37:22
     * 则返回的结果为2019-05-01 00:00:00
     */
    public static Date getDateByInitMonth(Date date) {
        // 创建日历对象,默认是当前系统时间的日历时间
        Calendar r = Calendar.getInstance();
        // 放入传进来的日期对象
        r.setTime(date);
        // 我们题目要求是年月不变,所以从天开始设置为1,时间为0
        r.set(Calendar.DAY_OF_MONTH, 1);// 月的第一天
        r.set(Calendar.HOUR_OF_DAY, 0);// 天的第0小时
        r.set(Calendar.MINUTE, 0);// 0分钟
        r.set(Calendar.SECOND, 0);// 0秒
        return r.getTime();// 返回date对象
    }

    /**
     * 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
     * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
     * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
     * pattern = 1 对应"yyyy-MM-dd HH:mm:ss";
     * pattern = else 对应"yyyy-MM-dd";
     */
    public static Date getDateByFullMonth(String date, int pattern) {
        return getDateByFullMonth(parse(date, pattern));
    }

    /**
     * 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
     * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
     * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
     */
    public static Date getDateByFullMonth(Date date) {
        // 获取当前系统时间的日历对象
        Calendar r = Calendar.getInstance();
        // 把时间更新为传过来的时间(上一步仅仅是为了获得日历对象而已,下边放入date才是用法)
        r.setTime(date);
        // 思考:要求获得的是当月的最后一天最后一秒,反向思维,我们获取 (下一月) 的第一天-1秒即可(因为我们不能计算闰年)
        r.set(Calendar.DAY_OF_MONTH, 1);// 月的第一天
        r.set(Calendar.HOUR_OF_DAY, 0);// 天的第0小时
        r.set(Calendar.MINUTE, 0);// 0分钟
        r.set(Calendar.SECOND, 0);// 0秒
        r.add(Calendar.MONTH, 1);// add方法,是把月的字段加上后边的数字,数字可以是负数
        r.add(Calendar.SECOND, -1);// -1秒时间又变回了本月最后一天最后一秒
        return r.getTime();
    }

    /**
     * 生成指定范围内随机日期.如 2010年1月1日至今任意随机时间创建randomDate方法
     * pattern = 1 对应"yyyy-MM-dd HH:mm:ss";
     * pattern = else 对应"yyyy-MM-dd";
     */
    public static Date randomDate(String d1, String d2, int pattern) {
        Date d01 = parse(d1, pattern);
        Date d02 = parse(d2, pattern);
        return randomDate(d01, d02);
    }

    /**
     * 生成指定范围内随机日期.如 2010年1月1日至今任意随机时间创建randomDate方法
     */
    public static Date randomDate(Date d1, Date d2) {
        // 生成起始毫秒值
        long t1 = d1.getTime();
        // 生成结束毫秒值
        long t2 = d2.getTime();
        // 获取这两个long值的中间的随机数
        long t3 = (long) (Math.random() * (t2 - t1 + 1) + t1);
        return new Date(t3);
    }

    /**
     * date类型转换为String类型.
     * pattern = 1 对应"yyyy-MM-dd HH:mm:ss";
     * pattern = else 对应"yyyy-MM-dd";
     */
    public static String format(Date date, int pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                pattern == 1 ? "yyyy-MM-dd HH:mm:ss" : "yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        return format;
    }

    /**
     * String转换为Date
     * pattern = 1 对应"yyyy-MM-dd HH:mm:ss";
     * pattern = else 对应"yyyy-MM-dd";
     */
    public static Date parse(String str, int pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                pattern == 1 ? "yyyy-MM-dd HH:mm:ss" : "yyyy-MM-dd");
        Date parse = null;
        try {
            parse = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }

    /**
     * 输入生日,死亡时间(当前时间),返回年龄,或者存活时间(不到一年返回月数,月数大于10000)
     * 需要try一下,生日不能比当前时间还晚
     */
    public static int getAge(String birthDay, String dieDate, int pattern) throws Exception {
        Date d1 = parse(birthDay, pattern);
        Date d2 = parse(dieDate, pattern);
        return getAge(d1, d2);
    }

    /**
     * 输入生日,死亡时间(当前时间),返回年龄,或者存活时间(不到一年返回月数,月数大于10000)
     * 需要try一下,生日不能比当前时间还晚
     */
    public static int getAge(Date birthDay, Date dieDate) throws Exception {
        Calendar cal = Calendar.getInstance();
        // 把时间更新为传过来的时间(上一步仅仅是为了获得日历对象而已,下边放入date才是用法)
        cal.setTime(dieDate);//死亡时间
        if (cal.before(birthDay)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);

        cal.setTime(birthDay);//生日
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                }
            } else {
                age--;
            }
        }
        //不到1岁的,返回月份,调用的方法进行一次判断,如果age大于10000,就除以10000,变为月份
        if (age == 0) {
            if (monthNow > monthBirth) {
                //2020-03-10   2020-01-20
                if (dayOfMonthNow >= dayOfMonthBirth) { //10>=20
                    age = (monthNow - monthBirth) * 10000;
                } else {
                    age = (monthNow - monthBirth - 1) * 10000;
                }
            } else {
                //2020-03-10   2019-11-20
                if (dayOfMonthNow >= dayOfMonthBirth) { //10>=20
                    age = (12 - monthBirth + monthNow) * 10000;
                } else {
                    age = (12 - monthBirth + monthNow - 1) * 10000;
                }
            }
        }
        return age;
    }

    /**
     * 是否为当天,只能传入yyyy-MM-dd
     */
    public static boolean isToday(String date) {
        return date.equals(format(new Date(), 0).toString());
    }

    /**
     * 是否为当天
     */
    public static boolean isToday(Date date) {
        return format(date, 0).toString().equals(format(new Date(), 0).toString());
    }

    /**
     * 判断是否是本周
     */
    public static boolean isThisWeek(String date, int pattern) {
        return isThisWeek(parse(date, pattern));
    }

    /**
     * 判断是否是本周
     */
    public static boolean isThisWeek(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar firstDayOfWeek = Calendar.getInstance(Locale.getDefault());
        firstDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);
        int day = firstDayOfWeek.get(Calendar.DAY_OF_WEEK);
        firstDayOfWeek.add(Calendar.DATE, -day + 1 + 1);// 后面的+1是因为从周日开始
        // 本周一的日期
        System.out.println(format.format(firstDayOfWeek.getTime()));

        Calendar lastDayOfWeek = Calendar.getInstance(Locale.getDefault());
        lastDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);
        day = lastDayOfWeek.get(Calendar.DAY_OF_WEEK);
        lastDayOfWeek.add(Calendar.DATE, 7 - day + 1);
        // 本周星期天的日期
        System.out.println(format.format(lastDayOfWeek.getTime()));

        return (date.getTime() < lastDayOfWeek.getTime().getTime()
                && date.getTime() > firstDayOfWeek.getTime().getTime());
    }

    /**
     * 剩余天数
     */
    public static int remainingDays(Date d1, Date d2) {
        return (int) ((d1.getTime() - d2.getTime()) / (3600 * 24));
    }
}

/**
 *
 **/
