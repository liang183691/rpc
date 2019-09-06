package cn.zhh.util;

import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * IP相关工具类
 * 
 * @author z_hh  
 * @date 2019年1月10日
 */
public class IpUtils {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	/**
	 * 获取本机IP
	 * @return IP
	 */
	public static String getLocalAddress(){
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			LOGGER.error("获取本机IP异常！", e);
		}
		return "127.0.0.1";
	}
}
