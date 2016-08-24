package com.netty.demo;

import java.util.Date;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;


public class TimeServerHandler extends ChannelInboundHandlerAdapter{
	
	
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		ByteBuf buf = (ByteBuf) msg;
		byte[] req = new byte[buf.readableBytes()];
		buf.readBytes(req);
		String body = new String(req,"UTF-8");
		System.out.println("The time server receive order : "+body);
		String currentTime = "Query time order".equalsIgnoreCase(body)
				?
					new Date(System.currentTimeMillis()).toString()
				:
					"Bad order";
		ByteBuf resq = Unpooled.copiedBuffer(currentTime.getBytes());
		ctx.write(resq);
		
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		ctx.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}