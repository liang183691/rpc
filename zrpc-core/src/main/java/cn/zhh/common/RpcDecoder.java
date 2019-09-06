package cn.zhh.common;

import java.util.List;

import cn.zhh.util.SerializationUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * RPC解码器
 * 
 * @author z_hh
 * @time 2019年1月8日
 */
public class RpcDecoder extends ByteToMessageDecoder {

	@Override
	public final void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (in.readableBytes() < 4) {
			return;
		}
		in.markReaderIndex();
		int dataLength = in.readInt();
		if (dataLength < 0) {
			ctx.close();
		}
		if (in.readableBytes() < dataLength) {
			in.resetReaderIndex();
		}
		// 将ByteBuf转换为byte[]
		byte[] data = new byte[dataLength];
		in.readBytes(data);
		// 将data转换成object
		Object obj = SerializationUtils.deserialize(data);
		out.add(obj);
	}
}
