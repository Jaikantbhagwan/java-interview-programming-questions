public class MyDeadlock {
 
    String str1 = "Java";
    String str2 = "UNIX";
     
    Thread trd1 = new Thread("My Thread 1"){
        public void run(){            
                synchronized(str1){
                	System.out.println("Test 1");
                	try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    synchronized(str2){
                        System.out.println(str1 + str2);
                    }
                }            
        }
    };
     
    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
           
                synchronized(str1){
                	System.out.println("Test 2");
                	try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    synchronized(str2){
                        System.out.println(str2 + str1);
                    }
                }           
        }
    };
     
    public static void main(String a[]){
        MyDeadlock mdl = new MyDeadlock();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}
