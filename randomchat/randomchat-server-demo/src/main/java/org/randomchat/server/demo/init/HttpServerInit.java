package org.randomchat.server.demo.init;

import org.randomchat.common.http.HttpConfig;
import org.randomchat.server.demo.ImServerDemoStart;
import org.randomchat.common.ImConfig;

import com.jfinal.kit.PropKit;

/**
 * 
 * @author Leo Yang
 *
 */
public class HttpServerInit {

	public static void init(ImConfig imConfig) throws Exception {
		PropKit.use("app.properties");
		String pageRoot = PropKit.get("http.page");//html/css/js等的根目录，支持classpath:，也支持绝对路径
		String[] scanPackages = new String[] { ImServerDemoStart.class.getPackage().getName() };//j-im mvc需要扫描的根目录包
		HttpConfig httpConfig = new HttpConfig();
		httpConfig.setPageRoot(pageRoot);//设置web访问路径;
		httpConfig.setMaxLiveTimeOfStaticRes(0);//不缓存资源;
		httpConfig.setScanPackages(scanPackages);//设置j-im mvc扫描目录;
		imConfig.setHttpConfig(httpConfig);
	}
	/**
	 * @author Leo Yang
	 * 
	 */
	public HttpServerInit() {
		
	}
}
