public class LineUsageData {

	private SinglyLinkedList<Usage> list = new SinglyLinkedList<Usage>();

	public LineUsageData() {
	}

	public void addObservation(String username) {

		for(int i=0; i< this.list.size() ;i++) {
			if (username.equals(this.list.get(i).getUser())) {
				this.list.get(i).incrementCount();
				return;
			}
		}
		this.list.add(new Usage(username, 1)); 
	}

	public Usage findMaxUsage() {

		Usage result = new Usage(null, 0);
		for (int i = 0; i < this.list.size(); i++) {
			if (list.get(i).getCount() > result.getCount())
				result = list.get(i);		
		}
		return result;
	}

	public int size() {
                return this.list.size();
        }
}
