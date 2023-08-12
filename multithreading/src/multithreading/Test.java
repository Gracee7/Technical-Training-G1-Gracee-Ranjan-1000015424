package multithreading;

import java.lang.Runnable;

/*
 // 1st program
public class Test implements Runnable {
public static void main(String[] args) {
new Test();
}
public Test() {
Test task = new Test();
new Thread(task).start();
}

public void run() {
System.out.println("test");
}
}
*/
 /*
 //solution for 1st
//public class Test implements Runnable{
public class Test{
         
	public static void main(String[] args) {
		Test1 task=new Test1();
		new Thread(task).start();
		// TODO Auto-generated method stub

	}
}
	 class Test1 implements Runnable{

	public Test1() {
		//Test1 task=new Test1();
		//new Thread(task).start();
	}
	public void run() {
		System.out.println("task");
	}

}
*/

//2nd program
/*
 public class Test implements Runnable {
public static void main(String[] args) {
new Test();
}
public Test() {
Thread t = new Thread(this);
t.start();
t.start();
}
public void run() {
System.out.println("test");
}
}
 */
//solution for 2nd program
/*
public class Test
{
	public static void main(String[] args) {
		Test1 test=new Test1();
		Thread t=new Thread(test);
		//t.start();
		t.start();	
	}
}
class Test1 implements Runnable{
	public Test1() {
		
	}
	public void run() {
		System.out.println("test");
	}
}
*/
