package week3.day5;

public class LearnCompileTimeException {

	public static void main(String[] args) {
		try {
			walk();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void walk() throws InterruptedException, Exception {
		Thread.sleep(2000);
	}

}
