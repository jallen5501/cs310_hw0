import java.io.*;
public class TermReport {

 	public static void main(String[] args) throws IOException {

		LineUsageData[] linelist = new LineUsageData[500];
		for (int i = 0; i < 500; i++)
			linelist[i] = new LineUsageData();

        	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (String line; (line = in.readLine()) != null; ) {
			String[] x = line.split(" ");
			linelist[Integer.parseInt(x[0])].addObservation(x[1]);
		}

		System.out.println("Line, Most Common User, Count");
		for (int i = 0; i < 500; i++) {
			if (linelist[i].size() != 0)
				System.out.println((i + 1) + ", " + linelist[i].findMaxUsage());
			else
				System.out.println((i + 1) + ", -NONE-, 0");
		}
	}
}
