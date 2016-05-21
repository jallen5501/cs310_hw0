public class LineUsageData {

	private SinglyLinkedList<Usage> list = new SinglyLinkedList<Usage>();

	public void addObservation(String username) {
		list.add(new Usage(username, 0));
	}

	public Usage findMaxUsage() {
		Usage result;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).count > result.count)
				result = list.get(i);		
		}		
	return result;
	}

}
