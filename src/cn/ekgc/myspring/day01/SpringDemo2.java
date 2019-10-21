package cn.ekgc.myspring.day01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
	public static void main(String[] args) {
		String path = "cn/ekgc/myspring/day01/ioc1.xml";
//		ShowHello showHello = new ShowHello();
////		EnHelloWorld helloWorld = new EnHelloWorld();
//		ZhHelloWorld helloWorld = new ZhHelloWorld();
//		showHello.setHelloWorld(helloWorld);
//		showHello.show();
		// 使用ClasspathXmlApplicationContext加载和创建Spring
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(path);
		ShowHello showHello = (ShowHello) context.getBean("showHello");
		showHello.show();
	}
}
