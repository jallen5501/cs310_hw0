import java.io.*;

public static void main(String[] args) {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private LineUsageData[500] linelist;
	String line;
 
	while (line = in.readLine != null) {
		String[] x = line.split(" ");	
		int index = 0;
		boolean present = false;
		while (list[x[0]].get(i) != null) {
			if (linelist[x[0]].get(i) == x[1])
				present = true;
			if (present == true) {
                        	linelist[x[0]].list.get(i).count++;
				continue;
			}
			list[x[0]].addObesrvation(new Usage(x[1],0));
		}
	}
	
	for (int i = 0; i < 500; i++) 
		System.out.format("%d, %s"i, list[i].findMaxUsage());

		
}
