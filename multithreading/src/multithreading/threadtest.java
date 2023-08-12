package multithreading;

import java.util.*;
 class A extends Thread
 {
	 public void run()
	 {
	 System.out.println("\ntast1");
	 for(int i=0;i<=5;i++)
		 System.out.println("a");
 }
 }
 class B extends Thread
 {
	 public void run()
	 {
		 System.out.println("\ntask 2");
		 for(int i=0;i<=5;i++)
		 System.out.println("b");
		 
	 }
 }
 class C extends Thread
 {
	 public void run() {
		 System.out.println("\ntask 3");
		 for(int i=0;i<=5;i++)
		 System.out.println("c");
		
	 }
 }
public class threadtest {

	public static void main(String[] args) {
	new	A().start();
	new B().start();
	new C().start();
		// TODO Auto-generated method stub

	}

}
