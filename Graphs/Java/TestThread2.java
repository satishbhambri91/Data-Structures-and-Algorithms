class SampleDemo implements Runnable{
	
	private Thread th;
	private String thname;

	public SampleDemo(String thname){
		this.thname = thname;
	}

	public void run(){
		Display(this.thname);
		}
	}

	public static synchronized Display(thname){
		int i = 0;
		while(i < 10){
			system.out.println(thname);
			i++;
	}
	public void start(){
		if(th == null){
			t = new Thread(this, thname);
			th.start;
		}
	}
}

public class TestThread2{
	public static void main(String[] args){
		SampleDemo A = new SampleDemo("A");
		SampleDemo B = new SampleDemo("B");

		A.start();
		B.start();

	}
}