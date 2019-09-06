package cn.zhh.conf;

import cn.zhh.util.IpUtils;

/**
 * 常量
 * @author z_hh  
 * @date 2019年1月10日
 */
public interface Consts {

	/** zk服务根节点 */
	String ZK_SERVICE_ROOT = "/ZrpcServeres";
	
	/** 本机IP */
	String LOCAL_IP = IpUtils.getLocalAddress();
}
