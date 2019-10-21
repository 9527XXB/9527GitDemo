package cn.ekgc.myspring.day01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
	public static void main(String[] args) {
		String path = "cn/ekgc/myspring/day01/beans1.xml";
		// 在没有Spring的情况下，往往需要自己来创建一个对象，然后进行相应的调用
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.sayHello();
		// 通过ClasspathXmlApplicationContext这个类来加载和启动Spring框架
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(path);
		// 只需要使用Spring框架的对象context按照bean的id获得对应的对象即可
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.sayHello();
	}
}
