package cn.wemart.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author sean
 *
 */

public class LoadInfo {

	public static String path = "./Info.properties";
	public static String url;
	public static String ReceiverName;
	public static String ReceiverMobile;
	public static String ReceiverAddress;
	
	
	/**
	 * 加载用户信息
	 */
	static{
		InputStream in;
		try {
			in = new BufferedInputStream(new FileInputStream(path));
			 Properties p = new Properties();
			 p.load(in) ;
			 url = p.getProperty("url");
			 ReceiverName = p.getProperty("ReceiverName");
			 ReceiverMobile = p.getProperty("ReceiverMobile");
			 ReceiverAddress = p.getProperty("ReceiverAddress");
			 
		} catch (FileNotFoundException e) {
			System.out.println("加载用户信息文件失败");
		} catch (IOException e) {
			System.out.println("加载用户信息文件失败");
		}  
	}
}
