package qaace22training;

public class ExtendedThread extends Thread{

	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Start thread");
			try {
				//System.out.println("thread is going to sleep");
				ExtendedThread.sleep(1000);

				//System.out.println("thread wake up");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		ExtendedThread de = new ExtendedThread();
		
		
		System.out.println("getstate1"+de.getState());

		de.start();

		System.out.println("thread Name"+de.getName());
		System.out.println("thread Priority"+de.getPriority());

	}

}
