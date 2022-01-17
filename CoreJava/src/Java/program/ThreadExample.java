package Java.program;

public class ThreadExample extends Thread {
	public void run() {
		for(int i=1;i<=3;i++)
		{
			try{
	    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }  
		System.out.println("running thread state is : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getState());  // it will print state of the thread running
	    System.out.println("Thread Name : "+ Thread.currentThread().getName()+ " ::: "+ i);  
	    System.out.println("Is my thread alive or not? : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
	    System.out.println("The thread id is : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
		}  
	}
	public static void main(String[] args) {
		ThreadExample m1 =new ThreadExample();
		ThreadExample m2 =new ThreadExample();
		ThreadExample m3 =new ThreadExample();
		
		  m1.setName("IT");
		  m2.setName("Finance");
		  m3.setName("HR");
		 
		m1.start();
		m2.start();
		m3.start();
		
		

	}

}
