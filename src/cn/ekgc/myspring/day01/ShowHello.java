package cn.ekgc.myspring.day01;

public class ShowHello {
	private HelloWorld helloWorld;
	
	public void show() {
		helloWorld.sayHello();
	}
	
	public HelloWorld getHelloWorld() {
		return helloWorld;
	}
	public void setHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
}
