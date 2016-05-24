public class LineUsageData {

	private SinglyLinkedList<Usage> list;

	public LineUsageData() {
		list = new SinglyLinkedList<Usage>();
	}

	public void addObservation(String username) {
		if (this.list.size() == 0)
			this.list.add(new Usage(username, 1));
		else {
			boolean present = false;
			int index;
			for (index = 0; index < this.list.size(); index++) {
				if (username.equals(this.list.get(index).getUser())) 
					present = true;
				if (present)
					break;
			}
			if (present)
				this.list.get(index).addCount();
			else
				this.list.add(new Usage(username, 1));
		}
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
