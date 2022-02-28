package qaace22training;

public class RunnableThread implements Runnable{
	

	public void run() {
		for(int i=0;i<=2;i++) {
			System.out.println("Hey thread started");
			 try {

	                Thread.sleep(3000);

	            } catch (InterruptedException e) {

	                // TODO Auto-generated catch block

	                e.printStackTrace();

	            }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		RunnableThread d=new RunnableThread();
		Thread t1=new Thread(d);
		t1.start();

		RunnableThread down =new RunnableThread();
		Thread t2=new Thread(down);
		t2.start();

	}

}
