package tmall.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 工具包
 * 
 * @author soft01
 *
 */
public final class Util {
	/**
	 * 判断字符串是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return null == str || "".equals(str.trim()) ? true : false;
	}

	/**
	 * 判断字符串是否为整数
	 */
	public static boolean isNumber(String str) {
		try {
			Long.parseLong(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 判断字符串是否为数字 包括浮点
	 */
	public static boolean isNumberd(String str) {
		String reg = "^[0-9]+(.[0-9]+)?$";
		return str.matches(reg);
	}

	/**
	 * 判断字符串是否为yyyy-MM-dd格式 (如2018-10-10)
	 * @param str
	 * @return
	 */
	public static boolean isValidDate(String str) {
		boolean convertSuccess = true;
		// 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
			format.setLenient(false);
			format.parse(str);
		} catch (ParseException e) {
			// e.printStackTrace();
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			convertSuccess = false;
		}
		return convertSuccess;
	}
}
