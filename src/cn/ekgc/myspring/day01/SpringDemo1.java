package cn.ekgc.myspring.day01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
	public static void main(String[] args) {
		String path = "cn/ekgc/myspring/day01/beans1.xml";
		// ��û��Spring������£�������Ҫ�Լ�������һ������Ȼ�������Ӧ�ĵ���
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.sayHello();
		// ͨ��ClasspathXmlApplicationContext����������غ�����Spring���
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(path);
		// ֻ��Ҫʹ��Spring��ܵĶ���context����bean��id��ö�Ӧ�Ķ��󼴿�
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.sayHello();
	}
}
