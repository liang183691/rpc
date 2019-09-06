package cn.zhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.zhh.annotation.EnableRpcConfiguration;

@SpringBootApplication
@EnableRpcConfiguration// 开启RPC服务
public class ZrpcTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZrpcTestApplication.class, args);
	}

}