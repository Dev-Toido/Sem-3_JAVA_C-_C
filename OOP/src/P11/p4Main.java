package P11;
import java.text.SimpleDateFormat;
import java.util.Date;

public class p4Main {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

		System.out.println("Current Time:");

		try {
			while (true) {
				Date now = new Date();

				System.out.print("\r" + sdf.format(now));
				System.out.flush();

				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("\nClock stopped.");
		}
	}
}