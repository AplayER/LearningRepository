package com.netty.client.demo;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class TimeClient {
	
	public void connect(int port,String host) throws Exception{
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap client = new Bootstrap();
			client.group(group).channel(NioSocketChannel.class).
				option(ChannelOption.TCP_NODELAY, true).
				handler(new ChannelInitializer<SocketChannel>() {

					@Override
					protected void initChannel(SocketChannel ch)
							throws Exception {
						// TODO Auto-generated method stub
						ch.pipeline().addLast(new TimeClientHandler());
					}
				});
			ChannelFuture future = client.connect(host, port).sync();
			
			future.channel().closeFuture().sync();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			group.shutdownGracefully();
		}
		
	}

	public static void main(String[] args) throws Exception {
		int port = 8080;
		if (args!=null&&args.length>0) {
			try {
				port = Integer.valueOf(port);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		new TimeClient().connect(port, "127.0.0.1");
	}

}
