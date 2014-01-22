/**
 * 
 */
package com.linkwithweb.osgi;

//import org.apache.commons.lang3.StringUtils;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author Ashwin Kumar
 * 
 */
public class HelloActivator implements BundleActivator {
	public void start(BundleContext context) {
		for(int i = 0; i < 20; i++)
			// 3rdのライブラリを組み込むには、コツが必要。
			//System.out.println(StringUtils.join("aaa","bbb"));
			System.out.println("Hello World");
	}

	public void stop(BundleContext context) {
		System.out.println("Goodbye All");
	}
}