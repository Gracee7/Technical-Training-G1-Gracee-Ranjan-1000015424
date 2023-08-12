package multithreading;

import java.lang.Runnable;
import java.lang.Thread;

 class taskclass extends Thread{
	 taskclass(){
		 System.out.println("task 1");
			for(int i=0;i<=5;i++)
				System.out.println("a");
			System.out.println("\ntask 2");
			for(int j=0;j<=5;j++)
				System.out.println("b");
			System.out.println("\ntask 3");
			for(int k=0;k<5;k++)
				System.out.println("1");
		 
	}
	public void run(){
		
		System.out.println("multithreading");
	}
}

public class client {

	public static void main(String[] args) {
		
		taskclass task= new taskclass();
		Thread thread= new Thread(task);
		thread.start();
		// TODO Auto-generated method stub

	}

}
