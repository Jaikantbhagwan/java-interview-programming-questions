import java.util.concurrent.TimeUnit;

public class ThreadStopDemo 
{ 
	public static void main(String args[]) throws InterruptedException { 
		Server myServer = new Server(); 
		Thread t1 = new Thread(myServer, "T1"); 
		t1.start(); 
		Thread.sleep(1);
		//Now, let's stop our Server thread 
		System.out.println(Thread.currentThread().getName() + " is stopping Server thread");
		myServer.stop();
		//Let's wait to see server thread stopped 
		TimeUnit.MILLISECONDS.sleep(200); 
		System.out.println(Thread.currentThread().getName() + " is finished now");
		} 
	} 
class Server implements Runnable{ 
	private volatile boolean exit = false; 
	public void run() { 
		while(!exit){ 
			System.out.println("Server is running....."); 
			} 
		System.out.println("Server is stopped....");
		} 
	public void stop(){
			exit = true; 
			} 
		}
	//}
//}

