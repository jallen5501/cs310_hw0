import java.util.Random;

public class makeLog {

	public static void main (String[] args) {

		String[] users = new String[20];
		Random a = new Random();

		for (int i = 0; i < 20; i++)
			users[i] = "USER" + i;

		for (int i = 0; i < 1500; i++) {
			int currentUser = a.nextInt(500);
			int countCount = a.nextInt(20);
			for (int j = 0; j < a.nextInt(50); j++)
				System.out.println(currentUser + " " + users[countCount]);
		}	
	}

}
