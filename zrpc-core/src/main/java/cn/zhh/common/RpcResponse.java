package cn.zhh.common;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * rpc响应实体类
 * 
 * @author z_hh
 * @time 2019年1月8日
 */
@Getter
@Setter
@ToString
public class RpcResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 错误 */
	private Throwable error;

	/** 结果 */
	private Object result;

}
