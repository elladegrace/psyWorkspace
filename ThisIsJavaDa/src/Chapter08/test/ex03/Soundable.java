package Chapter08.test.ex03;

public interface Soundable { //ch07-ch08-ch05-ch06
	String sound();
	void sound() {}
}
class Cat extends Soundable {
	void sound() {System.out.println("具克");}
}
class Dog extends Soundable {
	void sound() {System.out.println("港港");}
}
